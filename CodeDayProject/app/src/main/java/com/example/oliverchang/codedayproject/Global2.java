package com.example.oliverchang.codedayproject;

import java.util.ArrayList;

/**
 * Created by Oliver Chang on 2/14/2016.
 */
public class Global2 {
    private static Global2 instance;

    private String word;

    private Global2(){};

    public void getGlobal2(String s){
        word = s;
    }

    public String getMessage(){
        return word;
    }

    public static synchronized Global2 getInstance(){
        if(instance == null){
            instance=new Global2();
            // heck yeah bud bud
        }
        return instance;
    }
}
