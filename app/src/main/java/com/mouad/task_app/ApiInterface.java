package com.mouad.task_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("save.php")
    Call<Task> saveTask(
            @Field("title") String title,
            @Field("task") String task,
            @Field("color") int color
    );

    //get all tasks :
    @GET("tasks.php")
    Call<List<Task>> getTasks();

    @FormUrlEncoded
    @POST("update.php")
    Call<Task> updateTask(
            @Field("id") int id,
            @Field("title") String title,
            @Field("task") String task,
            @Field("color") int color
    );

    @FormUrlEncoded
    @POST("delete.php")
    Call<Task> deleteTask( @Field("id") int id );
}
