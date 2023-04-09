package ru.netology.service;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemain() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }
    @org.junit.Test
    public void testRemainWithCashback() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected,actual);
    }
}