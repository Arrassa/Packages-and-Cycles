package ru.netology;

public class VacationService {

    public int calculate(int income, int expense, int threshold) {
        int vacationMonth = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                vacationMonth++;
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return vacationMonth;
    }


}
