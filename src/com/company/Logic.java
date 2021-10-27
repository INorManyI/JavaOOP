package com.company;

public class Logic
{
    Function function = new Function();

    public Response head (String message)
    {
        if (message.equals("/Help"))
        {
            return function.help();
        }
        else if (message.equals("/LastUpdate"))
        {
            return function.lastUpdate();
        }
        else if (message.equals(""))
        {
            return new Response("Запрос пуст");
        }
        else return new Response("Ошибка: неизвестный запрос");
    }
}
