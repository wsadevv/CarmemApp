package com.wsadevv.carmemapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button btnData;
    private Button btnHora;
    private EditText servico;
    private Button btnMarcar;
    private String data;
    private String hora;
    private int mYear, mMonth, mDay, mHour, mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        btnData = (Button) findViewById(R.id.btnDataID);
        btnHora = (Button) findViewById(R.id.btnHoraID);
        btnMarcar = (Button) findViewById(R.id.marcarID);
        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Escolheu a data!!", Toast.LENGTH_SHORT).show();
            }
        });

        btnHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Escolheu a hora!!", Toast.LENGTH_SHORT).show();

            }
        });
        btnMarcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Marcou!!", Toast.LENGTH_SHORT).show();

            }
        });


    }

}