package com.wsadevv.carmemapp.core.dao;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by wsadevv on 05/12/16.
 */

public class FirebaseDB {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();

    public FirebaseDatabase getDatabase() {
        return database;
    }

    public void setDatabase(FirebaseDatabase database) {
        this.database = database;
    }

}
