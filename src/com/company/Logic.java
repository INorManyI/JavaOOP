package com.company;

public class AI
{
    Function function = new Function();

    public String head (String message)
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
            return "Запрос пуст";
        }
        else return "Ошибка: неизвестный запрос";
    }
}
