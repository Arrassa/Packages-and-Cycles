
package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationTest {
    @Test
    public void shouldCalcVacationMonths1() {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 9;

        int actual = service.calculate(income, expenses);
        System.out.println(expected);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcVacationMonths2() {
        VacationService service = new VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 7;

        int actual = service.calculate(income, expenses);
        System.out.println(expected);

        Assertions.assertEquals(expected, actual);
    }

}






