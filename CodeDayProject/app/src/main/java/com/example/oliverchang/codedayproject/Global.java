package com.example.oliverchang.codedayproject;

import java.util.ArrayList;

/**
 * Created by Oliver Chang on 2/13/2016.
 */
public class Global {
    private static Global instance;


    private ArrayList<String> list = new ArrayList<String>();

    private Global(){};

    public void add(String s){
        list.add(s);
    }

    public String get(){
        int rando = (int)(Math.random()*list.size());
        return list.get(rando);
    }

    public static synchronized Global getInstance(){
        if(instance == null){
            instance=new Global();
            // heck yeah bud bud
        }
        return instance;
    }
}
