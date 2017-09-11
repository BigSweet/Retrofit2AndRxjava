package cn.primedu.m.retrofit2andrxjava2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.primedu.m.retrofit2andrxjava2.retrofit.BaseObserver;
import cn.primedu.m.retrofit2andrxjava2.retrofit.CateBean;
import cn.primedu.m.retrofit2andrxjava2.retrofit.RetrofitManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitManager.getInstance().getTest().subscribe(new BaseObserver<CateBean>() {
            @Override
            public void onHandleSuccess(CateBean cateBean) {

            }




        });
    }
}
