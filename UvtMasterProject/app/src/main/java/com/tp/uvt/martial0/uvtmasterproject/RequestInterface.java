package com.tp.uvt.martial0.uvtmasterproject;

/**
 * Created by martial0 on 12/26/17.
 */

import com.tp.uvt.martial0.uvtmasterproject.models.ServerRequest;
import com.tp.uvt.martial0.uvtmasterproject.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("retrofit-project/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}