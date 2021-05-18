package com.davidulloa.examen_2021_05_17.api;

import androidx.lifecycle.LiveData;

import com.davidulloa.examen_2021_05_17.data.remote.response.ResponseData;

import retrofit2.http.GET;

public interface ExamenService {

    @GET("s/5u21281sca8gj94/getFile.json?dl=0")
    LiveData<ResponseData> getData();
}
