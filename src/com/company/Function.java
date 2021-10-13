package com.company;

import java.util.Date;

public class Function
{
    public String startMessage()
    {
        return "Я бот показывающий последнюю информацию по CSGO, чтобы узнать, что я умею напишите: /Help";
    }

    public String help()
    {
        return "/LastUpdate - узнать когда и какое было последнее обновление";
    }

    public String lastUpdate()
    {
        Date date1 = new Date();
        return "Вот :  " + date1.getHours();
    }
}
