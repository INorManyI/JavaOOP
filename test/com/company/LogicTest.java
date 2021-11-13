package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LogicTest
{
    Logic logic = new Logic();

    @Test
    void testHelpMassage()
    {
        assertEquals(logic.heading(new Request("/Help")).getAnswer(), "/LastUpdate - узнать когда и какое было последнее обновление");
    }

    @Test
    void testLastUpdateMassage()
    {
        assertEquals(logic.heading(new Request("/LastUpdate")).getAnswer(), "Вот :  ");
    }

    @Test
    void testEmptinessMassage()
    {
        assertEquals(logic.heading(new Request("")).getAnswer(), "Запрос пуст");
    }

    @Test
    void testOtherMassage()
    {
        assertEquals(logic.heading(new Request("fdsaf")).getAnswer(), "Ошибка: неизвестный запрос");
    }
}