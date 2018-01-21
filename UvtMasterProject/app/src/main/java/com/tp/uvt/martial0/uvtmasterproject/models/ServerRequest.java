package com.tp.uvt.martial0.uvtmasterproject.models;

/**
 * Created by martial0 on 12/26/17.
 */
public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}