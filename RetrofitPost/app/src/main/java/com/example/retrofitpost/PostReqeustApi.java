package com.example.retrofitpost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PostReqeustApi {

    // https://httpbin.org/post

    @POST("post")
    Call<PostModel> PostDataIntoServer(@Body PostModel postModel);



    // PUT : http://httpbin.org/put

    @PUT("put")
    Call<PostModel> UpdateData(@Body PostModel postModel);
}