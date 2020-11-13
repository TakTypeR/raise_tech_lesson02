package com.company;

public class Boss extends Person
{
    //Constructor
    public Boss(){
        super("Boss");
    }

    public String greet()
    {
        return "Hello!";
    }
    public boolean isOutsider(String iLocation)
    {
        return !iLocation.equals("Workplace");
    }
}
