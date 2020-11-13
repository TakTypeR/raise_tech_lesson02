package com.company;

public class Student extends Person {
    //Constructor
    public Student(){ super("Student"); }

    public String greet()
    {
        return "Hello!";
    }
    public boolean isOutsider(String iLocation)
    {
        return !iLocation.equals("HighSchool");
    }
}
