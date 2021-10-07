package com.company;

import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Я бот показывающий последнюю информацию по CSGO");
        System.out.println("я знаю команды: /Help, Stop, Последнее обновление");
        while(true) {
            Scanner input = new Scanner(System.in);
             String string = input.nextLine();
            if(string.equals("Stop")) {break;}
            else if(string.equals("/Help")) {
                System.out.println("Вот твоя помощь");
            }else if(string.equals("Последнее обновление")) {
                Date date1 = new Date();
                System.out.println("Воть :  " + date1.getHours());
            }else if(string.equals("")) {
                System.out.println("Запрос не верен");
            }else{
                System.out.println("Ошибка: неизвестный запрос");
            }
        }
    }

}

