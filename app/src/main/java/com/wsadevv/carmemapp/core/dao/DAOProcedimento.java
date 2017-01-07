package com.wsadevv.carmemapp.core.dao;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by wsadevv on 05/12/16.
 Conecta o app com o Firebase

 */


public class DAOProcedimento {
    private DatabaseReference mDatabase;


    public void createPersistence(){
        mDatabase = new FirebaseDB().getDatabase().getReference();
    }
    public void persist(Procedimento procedimento){
        //push child dentro do procedimento
        mDatabase.child("Procedimento").push().setValue(procedimento);
//
    }

}
