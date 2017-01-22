package com.yossh.mvpdaggerrxjavaretrofit.api;

import com.yossh.mvpdaggerrxjavaretrofit.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by TEAM on 1/22/2017.
 * That's it
 */

class RestClient {

    static <S> S createService(Class<S> serviceClass) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(BuildConfig.DEBUG ?
                HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE); // add log for debug mode

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        //httpClient.connectTimeout(5, TimeUnit.MINUTES);
        //httpClient.readTimeout(60, TimeUnit.SECONDS);
        //httpClient.writeTimeout(60, TimeUnit.MILLISECONDS);//set timeout
        OkHttpClient client = httpClient.build();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
               // .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();

        return retrofit.create(serviceClass);
    }

}