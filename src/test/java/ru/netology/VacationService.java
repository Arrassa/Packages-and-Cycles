package ru.netology;

public class VacationService {

    public int calcVacationMonths(int income, int expenses, int threshold) {

        int vacationMonths = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету


        for (int i = 0; i < 12; i++) {
            if (money < threshold) { // можем ли отдыхать?
                money += income;
                money -= expenses;
            } else {
                money -= expenses;
                money /= 3;
                vacationMonths++;
            }
        }
        return vacationMonths;
    }
}

