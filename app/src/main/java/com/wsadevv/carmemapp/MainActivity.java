package com.wsadevv.carmemapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;
import com.wsadevv.carmemapp.dao.DAOProcedimento;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {
    private Button btnData;
    private Button btnHora;
    private EditText servico;
    private Button btnMarcar;
    private DialogFragment datePickerFragment;
    private DialogFragment timeFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        btnData = (Button) findViewById(R.id.btnDataID);
        btnHora = (Button) findViewById(R.id.btnHoraID);
        servico = (EditText)findViewById(R.id.procedimentoID);
        btnMarcar = (Button) findViewById(R.id.marcarID);
        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog(view);
            }
        });

        btnHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            showTimePicker(view);
            }
        });

        btnMarcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Procedimento procedimento = new Procedimento();
                String data = btnData.getText().toString();
                String hora = btnHora.getText().toString();
                servico = (EditText)findViewById(R.id.procedimentoID);
                String service = servico.getText().toString();
                if(servico.getText().toString().trim().equals("")){
                    servico.setError("Procedimento não pode ser vazio!");
                    servico.setHint("Insira o procedimento a ser feito...");

                }

                data = dataParser(data);
                //hora = hora.replaceAll("\\D", "");
                Log.i("HORA FIX",hora);
                Log.i("DATA FIX",data);

                procedimento.setProcedimento(service);
                procedimento.setData(data);
                procedimento.setHora(hora);
                DAOProcedimento myDao = new DAOProcedimento();
                myDao.createPersistence();
                myDao.persist(procedimento);



                Snackbar.make(view,"Procedimento agendado com sucesso!",Snackbar.LENGTH_LONG).show();
                Log.i("Procedure: ", procedimento.toString());




            }
        });


    }

    @NonNull
    private String dataParser(String data) {
        /*
        data = data.replaceAll("\\D", "");
        retira todos os caracteres não numéricos
        */
        if(data.length() == 9){
            Log.i("STRING CAPADA",data);
            String zero = "0";
            StringBuilder sb = new StringBuilder(zero);
            sb.append(data);
            data = sb.toString();

        }
        return data;
    }

    public void showDatePickerDialog(View v) {
        datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(), "datePicker");




    }
    public void showTimePicker(View v){
        timeFragment = new TimePickerFragment();
        timeFragment.show(getSupportFragmentManager(),"timePicker");
    }

}