package com.androidtutorialshub.loginregister.model;

/**
 * Created by lalit on 9/12/2016.
 */
public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private float moy_bac;
    private float moy_a1;
    private float moy_a2;
    private float moy_a3;

    private int nbr_cntrl;
    private String nbr_rdb;
    private String age ;


    public float getMoy_bac() {
        return moy_bac;
    }

    public void setMoy_bac(float moy_bac) {
        this.moy_bac = moy_bac;
    }

    public float getMoy_a1() {
        return moy_a1;
    }

    public void setMoy_a1(float moy_a1) {
        this.moy_a1 = moy_a1;
    }

    public float getMoy_a2() {
        return moy_a2;
    }

    public void setMoy_a2(float moy_a2) {
        this.moy_a2 = moy_a2;
    }

    public float getMoy_a3() {
        return moy_a3;
    }

    public void setMoy_a3(float moy_a3) {
        this.moy_a3 = moy_a3;
    }

    public int getNbr_cntrl() {
        return nbr_cntrl;
    }

    public void setNbr_cntrl(int nbr_cntrl) {
        this.nbr_cntrl = nbr_cntrl;
    }

    public String getNbr_rdb() {
        return nbr_rdb;
    }

    public void setNbr_rdb(String nbr_rdb) {
        this.nbr_rdb = nbr_rdb;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
