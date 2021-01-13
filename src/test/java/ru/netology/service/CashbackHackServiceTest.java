package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void shouldReturn500IfAmount500() {

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReturn1000IfAmount0() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReturn100IfAmount1900() {

        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReturn0IfAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

}