package ru.netology;


public class Main {
    public static void main(String[] args) {

        VacationService service = new VacationService();

        int actual =  service.calculate(10_000, 3_000, 20_000);


        var expected = 3;

        System.out.println(actual);



    }
}