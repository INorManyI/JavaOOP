package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Console console = new Console();
        Request request = new Request();

        console.print("Я бот показывающий последнюю информацию по CSGO, чтобы узнать, что я умею напишите: /Help");

        while(true)
        {
            String message = console.writeLine();

            console.print(request.answer(message));
        }
    }
}

