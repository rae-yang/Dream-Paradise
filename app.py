from flask import Flask, request, jsonify
from flask_sqlalchemy import SQLAlchemy
import pyodbc

app = Flask(__name__)

# Configure the SQL Server connection
app.config['SQLALCHEMY_DATABASE_URI'] = 'mssql+pyodbc://sa:welovedreamparadise@localhost/Baby Datbase?driver=ODBC+Driver+17+for+SQL+Server'
db = SQLAlchemy(app)

# Define a model for your data (example)
class BabySleepData(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    sleep_start = db.Column(db.DateTime, nullable=False)
    sleep_end = db.Column(db.DateTime, nullable=False)
    temperature = db.Column(db.Float, nullable=False)
    noise_level = db.Column(db.Float, nullable=False)

@app.route('/data', methods=['POST'])
def receive_data():
    data = request.json
    new_data = BabySleepData(
        sleep_start=data['sleep_start'],
        sleep_end=data['sleep_end'],
        temperature=data['temperature'],
        noise_level=data['noise_level']
    )
    db.session.add(new_data)
    db.session.commit()
    return jsonify({"message": "Data received"}), 201

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0', port=5000)
