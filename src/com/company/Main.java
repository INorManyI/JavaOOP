package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Console console = new Console();
        Logic logic = new Logic();

        console.print(new Response("Я бот показывающий последнюю информацию по CSGO, чтобы узнать, что я умею напишите: /Help"));

        while(true)
        {
            Request message = console.getRequest();
            console.print(logic.heading(message));
        }
    }
}

