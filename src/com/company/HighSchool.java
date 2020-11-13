package com.company;

public class HighSchool implements Communication
{
    private final String RESPONSE_MSG = "What's up?";

    public String greet(String iMsg)
    {
        String msg = "Ignore...";

        if( iMsg.equals("Hello") )
            msg = RESPONSE_MSG;
        return msg;
    }
    public String greet(Person iPerson) throws MyException
    {
        //部外者なら通報
        if(iPerson.isOutsider(location()))
        {
            //throw exception
            throw new MyException(location(), "Unknown Person shows!");
            //return "Ignore...";
        }
        return RESPONSE_MSG;
    }

    public String location(){ return "HighSchool"; }
    public boolean isWorkplace(){ return isWorkplace; }
    private final boolean isWorkplace = false;
}
