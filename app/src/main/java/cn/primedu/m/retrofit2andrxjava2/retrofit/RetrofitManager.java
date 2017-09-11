package cn.primedu.m.retrofit2andrxjava2.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import cn.primedu.m.retrofit2andrxjava2.MyApplication;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Cache;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@priemdu.cn
 * 时间: 2017/4/24
 */
public class RetrofitManager {

    private String baseurl = "写上你的baseurl";
    private static RetrofitManager Manager;
    private Gson gson;
    private Retrofit retrofit;
    File cacheFile = new File(MyApplication.getmContext().getCacheDir(), "cache");
    Cache cache = new Cache(cacheFile, 1024 * 1024 * 50); //50Mb 缓存的大小
    ApiService mApiService;

    private static class SingletonHolder {

        private static final RetrofitManager INSTANCE = new RetrofitManager();

    }


    public static RetrofitManager getInstance() {

        return SingletonHolder.INSTANCE;

    }

    private RetrofitManager() {
        gson = new GsonBuilder()
                .setLenient()
                .create();

        OkHttpClient client = new OkHttpClient
                .Builder()
                .addInterceptor(addQueryParameterInterceptor())  //参数添加
                .addInterceptor(addHeaderInterceptor()) // token过滤
                .addInterceptor(new LogInterceptor().setLevel(LogInterceptor.Level.BODY))
                .cache(cache)  //添加缓存
                .connectTimeout(60l, TimeUnit.SECONDS)
//                .addNetworkInterceptor(new LogInterceptor())
                .readTimeout(60l, TimeUnit.SECONDS)
                .writeTimeout(60l, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        mApiService = retrofit.create(ApiService.class);
    }

    /**
     * 设置公共参数
     */
    private static Interceptor addQueryParameterInterceptor() {
        Interceptor addQueryParameterInterceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                Request request;
                HttpUrl modifiedUrl = originalRequest.url().newBuilder()
                        // Provide your custom parameter here
                        .addQueryParameter("params1", "")
                        .addQueryParameter("params2", "")
                        .build();
                request = originalRequest.newBuilder().url(modifiedUrl).build();
                return chain.proceed(request);
            }
        };
        return addQueryParameterInterceptor;
    }

    /**
     * 设置头
     */
    private static Interceptor addHeaderInterceptor() {
        Interceptor headerInterceptor = new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                Request.Builder requestBuilder = originalRequest.newBuilder()
                        // Provide your custom header here
                        .header("token", (String) SpUtils.get("token", ""))
                        .method(originalRequest.method(), originalRequest.body());
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        };
        return headerInterceptor;
    }


    //测试类
    public Observable getTest() {
        return mApiService.getTest().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

    }


}