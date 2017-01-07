package com.wsadevv.carmemapp.core.activities;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.widget.TextView;

import com.wsadevv.carmemapp.R;
import com.wsadevv.carmemapp.utils.FontApplier;

public class SplashScreenActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView textoSplash = (TextView) findViewById(R.id.screenTextID);
        FontApplier fontApplier = new FontApplier();
        fontApplier.apply(textoSplash,getApplicationContext());
        Handler handler = new Handler();
        handler.postDelayed(this,3000);
    }
    @Override
    public void run() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }


}
