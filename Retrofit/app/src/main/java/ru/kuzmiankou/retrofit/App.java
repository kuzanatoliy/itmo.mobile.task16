package ru.kuzmiankou.retrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anatoliy on 13.11.2017.
 */

public class App extends Application {

    private static ApiInterface apiInterface;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
            .baseUrl("http://www.umori.li/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static ApiInterface getApi() {
        return apiInterface;
    }
}
