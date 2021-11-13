package com.company;

import java.util.Scanner;

public class Console
{
    Scanner input = new Scanner(System.in);

    public void print(Response response)
    {
        System.out.println(response.getAnswer());
    }

    public Request getRequest()
    {
        return new Request(input.nextLine());
    }
}
