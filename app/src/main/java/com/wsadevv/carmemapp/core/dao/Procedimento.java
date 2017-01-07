package com.wsadevv.carmemapp.core.dao;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by wsadevv on 05/12/16.
 */
@IgnoreExtraProperties
public class Procedimento {
    public String userId;

    public String  getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String data;
    private String hora;
    private String procedimento;

    public Procedimento() {
    }

    public Procedimento(String data, String hora, String procedimento) {
        this.data = data;
        this.hora = hora;
        this.procedimento = procedimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    @Override
    public String toString() {
        return "Procedimento: "+procedimento+" Data: "+data+" Hora: "+hora;
    }
}
