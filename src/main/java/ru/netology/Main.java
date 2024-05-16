package ru.netology;


public class Main {
    public static void main(String[] args) {

        VactionService service = new VactionService();

        int actual = service.calculateMoneyMonths();

        var expected = 3;
        actual = (int) service.calculateMoneyMonths();
        System.out.println(actual);



    }
}