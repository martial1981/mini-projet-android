package com.tp.uvt.martial0.listmaster;

/**
 * Created by martial0 on 1/14/18.
 */

public class Master {
    private int id;
    private String name;
    private double score;
    private String description;

    public Master(){
        super();
    }

    public Master(int id, String name, double score,String description) {
        super();
        this.id = id;
        this.name = name;
        this.score = score;
        this.description=description;
    }

    @Override
    public String toString() {
        return this.id + "-" +"  "+ this.name +"  "+  this.score +"  "+ this.description ;
    }
}
