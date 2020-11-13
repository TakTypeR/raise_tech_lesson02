package com.company;

public interface Communication
{
    String greet(String iMsg);
    String greet(Person iPerson) throws MyException;
    String location();
    boolean isWorkplace();
}
