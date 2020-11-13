package com.company;

public class Outsider extends Person {
    //Constructor
    public Outsider(){
        super("Outsider");
    }

    public String greet()
    {
        return "Hey! How's it going?";
    }
    public boolean isOutsider(String iLocation){ return true; }
}

