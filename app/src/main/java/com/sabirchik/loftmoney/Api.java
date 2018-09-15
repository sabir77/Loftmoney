package com.sabirchik.loftmoney;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("items")
    public List<Item> getItems(@Query("type")String type);
}
