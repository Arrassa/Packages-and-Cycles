package ru.netology;

class VactionService {

    public int calculateMoneyMonths() {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int threshold = 0;
        int expenses = 0;
        int income = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}