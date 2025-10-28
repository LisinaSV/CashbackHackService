package ru.netology.service;


import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void BoundaryValue() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected =0;

        assertEquals(expected,actual);
    }
    @Test
    public void BelowBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }

    @Test

    public void AboveBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(expected,actual);
    }
}
