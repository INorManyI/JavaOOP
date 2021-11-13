package com.company;

import java.util.Date;

public class Function
{
    public Response help()
    {
        return new Response("/LastUpdate - узнать когда и какое было последнее обновление");
    }

    public Response lastUpdate()
    {
        Date date1 = new Date();
        return new Response("Вот :  " + date1.getHours());
    }
}
