package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class MainTest {
 @Test
    void testCorrectHelloMassage() {
     String name  = "Test name";
     String helloMessage = Main.getHelloMassage(name);
     assertEquals("Hello, " + name + " !", helloMessage);
 }
}