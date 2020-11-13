package com.company;

abstract public class Person
{
    public Person(String iPos )
    {
        this.positionName = iPos;
    }
    abstract public String greet();
    abstract public boolean isOutsider(String iLocation);
    public String position(){ return positionName; }

    private final String positionName;
}
