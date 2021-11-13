package com.company;

public class Request
{
    public String answer(String message)
    {
        Logic logic = new Logic();
        return logic.head(message).getAnswer();
    }
}
