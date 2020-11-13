package com.company;

public class WorkplaceCommunication implements Communication
{
    private final String RESPONSE_MSG = "Hello!";

    public WorkplaceCommunication(){}

    public String greet(String iMsg){
        String msg = "disregard...";

        if( iMsg.equals("Hello") )
            msg = RESPONSE_MSG;
        return msg;
    }
    public String greet(Person iPerson) throws MyException{
        //部外者なら通報
        if(iPerson.isOutsider(location())){
            //throw exception
            throw new MyException(location(), "Unknown Person shows!");
            // return "Silence...";
        }
        return RESPONSE_MSG;
    }

    public String location(){ return "Workplace"; }
    public boolean isWorkplace(){ return isWorkplace; }

    //fields
    private boolean isWorkplace = true;
}
