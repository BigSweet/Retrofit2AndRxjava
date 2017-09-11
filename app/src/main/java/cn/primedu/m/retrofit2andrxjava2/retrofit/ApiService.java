package cn.primedu.m.retrofit2andrxjava2.retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * 介绍：所有的接口都写到这里
 * 作者：sweet
 * 邮箱：sunwentao@priemdu.cn
 * 时间: 2017/4/19
 */
public interface ApiService {

    // Base_URL = " http://api.douban.com/";
    /**
     *测试类
     */
    @GET("写上你的后缀url")
    Observable<BaseData<CateBean>> getTest();



}
