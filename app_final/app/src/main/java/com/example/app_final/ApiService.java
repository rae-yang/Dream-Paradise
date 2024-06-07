package com.example.app_final;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/data")
    Call<ResponseBody> sendData(@Body BabySleepData data);
}
