package com.company;

public class Logic
{
    Function function = new Function();

    public Response heading (Request request)
    {
        String message = request.getMessage();

        return switch (message) {
            case "/Help" -> function.help();
            case "/LastUpdate" -> function.lastUpdate();
            case "" -> new Response("Запрос пуст");
            default -> new Response("Ошибка: неизвестный запрос");
        };
    }
}
