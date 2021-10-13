package com.company;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AITest
{
    AI aI = new AI();

    @Test
    void testHelpMassage()
    {
        assertEquals(aI.head("/Help") , "/LastUpdate - узнать когда и какое было последнее обновление");
    }

    @Test
    void testLastUpdateMassage()
    {
        Date date1 = new Date();
        assertEquals(aI.head("/LastUpdate") , "Вот :  " + date1.getHours());
    }

    @Test
    void testEmptinessMassage()
    {
        assertEquals(aI.head("") , "Запрос пуст");
    }

    @Test
    void testOtherMassage()
    {
        assertEquals(aI.head("fdsaf") , "Ошибка: неизвестный запрос");
    }
}