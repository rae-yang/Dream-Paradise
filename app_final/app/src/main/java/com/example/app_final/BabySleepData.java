package com.example.app_final;

public class BabySleepData {
    private String sleepStart;
    private String sleepEnd;
    private float temperature;
    private float noiseLevel;

    // Constructor
    public BabySleepData(String sleepStart, String sleepEnd, float temperature, float noiseLevel) {
        this.sleepStart = sleepStart;
        this.sleepEnd = sleepEnd;
        this.temperature = temperature;
        this.noiseLevel = noiseLevel;
    }

    // Getters and Setters
    public String getSleepStart() { return sleepStart; }
    public void setSleepStart(String sleepStart) { this.sleepStart = sleepStart; }

    public String getSleepEnd() { return sleepEnd; }
    public void setSleepEnd(String sleepEnd) { this.sleepEnd = sleepEnd; }

    public float getTemperature() { return temperature; }
    public void setTemperature(float temperature) { this.temperature = temperature; }

    public float getNoiseLevel() { return noiseLevel; }
    public void setNoiseLevel(float noiseLevel) { this.noiseLevel = noiseLevel; }
}
