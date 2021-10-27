package com.company;

import java.util.Scanner;

public class Console
{
    Scanner input = new Scanner(System.in);

    public void print(String message)
    {
        System.out.println(message);
    }

    public String writeLine()
    {
        return input.nextLine();
    }
}
