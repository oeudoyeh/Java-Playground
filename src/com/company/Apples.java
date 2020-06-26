package com.company;


public class Apples {
    private String girlName;        //we don't want this accessed elsewhere

    //constructor
    public Apples(String name){
        //apparently, if you want to, you could just initialize every
        //thing in here, that's kinda crazy if you ask me :/
        girlName = name;
    }

    public void setName(String name){
        girlName = name;
    }
    public String getName(){
         return girlName;
    }
    public void saying(){
        System.out.println("your babe's name was " + getName());
    }

}
