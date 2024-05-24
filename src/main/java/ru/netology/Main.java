package ru.netology;


public class Main {
    public static void main(String[] args) {

        VactionService service = new VactionService();

        int actual = service.calcVacationMonths();

        var expected = 1;
        actual = (int) service.calcVacationMonths();
        System.out.println(actual);



    }
}