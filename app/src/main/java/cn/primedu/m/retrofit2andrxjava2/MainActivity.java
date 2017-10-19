package cn.primedu.m.retrofit2andrxjava2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import cn.primedu.m.retrofit2andrxjava2.retrofit.RetrofitManager;
import cn.primedu.m.retrofit2andrxjava2.retrofit.ShopAdvBean;
import cn.primedu.m.retrofit2andrxjava2.retrofit.UrlAddress;

public class MainActivity extends AppCompatActivity {

    String query_type = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RetrofitManager.getInstance().
                post(UrlAddress.getTest(), ShopAdvBean.class).subscribe(new BaseObserver<ShopAdvBean>() {

            @Override
            public void onHandleSuccess(ShopAdvBean testLodingBean) {
                Log.d("sss", "onHandleSuccess: sss");
            }

        });
    }
}
