package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Я бот который тебе поможет, нужна помощь /Help");
        boolean tt = true;
        while(tt = true) {
            Scanner input = new Scanner(System.in);
            String x = input.nextLine();
            System.out.print(x); System.out.println(tt);
            if(x.equals("Stop")) {
                break;
            }else if(x.equals("/Help")) {
                System.out.println("Вот твоя помощь");
            }else if(x.equals("Последние обновление")) {
                Date date1 = new Date();
                System.out.println("последние обновление было " + date1.getHours());
            }
        }
    }

}

