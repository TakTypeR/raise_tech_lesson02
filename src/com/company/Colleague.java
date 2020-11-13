package com.company;

public class Colleague extends Person
{
    //Constructor
    public Colleague(){
        super("Colleague");
    }

    public String greet()
    {
        return "Hey! How's it going?";
    }
    public boolean isOutsider(String iLocation)
    {
        return !iLocation.equals("Workplace");
    }
}
