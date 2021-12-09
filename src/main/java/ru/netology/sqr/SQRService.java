package ru.netology.sqr;

public class SQRService {

    public int calculateSquard(int n, int m) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= n && i*i <= m) {
                 counter++;

            }

        }

       return counter;
    }

}