package com.del.delcontainer.utils.apiUtils.interfaces;

import com.del.delcontainer.utils.apiUtils.pojo.UserDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface UserApi {

    @GET("user/{userId}")
    @Headers({"Content-Type: application/json"})
    Call<UserDetails> getSingleUserDetails(@Header("Authorization") String token,
                                           @Path("userId") String userId);
}
