package com.wsadevv.carmemapp;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by wsadevv on 05/12/16.
 */

public class FirebaseDB {
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    public FirebaseDatabase getDatabase() {
        return database;
    }

    public void setDatabase(FirebaseDatabase database) {
        this.database = database;
    }

}
