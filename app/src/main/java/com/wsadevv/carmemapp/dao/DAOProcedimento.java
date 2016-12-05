package com.wsadevv.carmemapp.dao;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.wsadevv.carmemapp.FirebaseDB;
import com.wsadevv.carmemapp.Procedimento;

/**
 * Created by wsadevv on 05/12/16.
 Conecta o app com o Firebase

 */


public class DAOProcedimento {
    private DatabaseReference mDatabase;


    public void createPersistence(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }
    public void persist(Procedimento procedimento){
        mDatabase.child("procedimento").setValue(procedimento);
        Log.i("Sucesso","Persistido com sucesso!");
    }
}
