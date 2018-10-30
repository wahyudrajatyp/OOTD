package com.example.lenovo.kuis;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //Memunculkan Splash
        tvSplash = (TextView) findViewById(R.id.tvSplash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            //untuk ke halaman selanjutnya
            public void run() {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
