package com.chainreaction.datafetch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndpointsInterface {

    @GET("list")
    Call<List<Item>> getAllItems();

}
