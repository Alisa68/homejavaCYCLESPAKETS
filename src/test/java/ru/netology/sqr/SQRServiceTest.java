package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldcalculateSquardUpperBound() {
        SQRService service = new SQRService();
        int expected = 3;
        int n =100;
        int m =150;
        int actual = service.calculateSquard( n, m) ;

        assertEquals(expected,actual);
    }

    @Test
    void shouldcalculateSquardLowerBound() {
        SQRService service = new SQRService();
        int expected = 2;
        int n =9500;
        int m =10000;
        int actual = service.calculateSquard( n, m) ;

        assertEquals(expected,actual);
    }

    @Test
    void shouldcalculateSquardAverageValue() {
        SQRService service = new SQRService();
        int expected = 13;
        int n =4500;
        int m =6500;
        int actual = service.calculateSquard( n, m) ;

        assertEquals(expected,actual);
    }
}