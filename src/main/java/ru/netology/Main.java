package ru.netology;


public class Main {
    public static void main(String[] args) {

        VactionService service = new VactionService();

        var expected = 3;
        int actual = (int) service.calculateMoneyMonths();


    }
}