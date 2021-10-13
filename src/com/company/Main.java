package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Function function = new Function();
        AI aI = new AI();

        function.startMessage();

        while(true)
        {
            String string = input.nextLine();
            String answer = aI.head(string);

            System.out.println(answer);
        }
    }
}

