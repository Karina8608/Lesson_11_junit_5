package Aston;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FactorialExampleTest {

    @Test
    void testFactorialWithPositiveNumber() {
        int number = 5;
        int expectedFactorial = 5;

        int actualFactorial = FactorialExample.main(number);

        assertEquals(expectedFactorial, actualFactorial, "Факториал " + number + " должен быть равен " + expectedFactorial);
    }

    @Test
    void testFactorialWithZero() {
        int number = 0;
        int expectedFactorial = 5;

        int actualFactorial = FactorialExample.main(number);

        assertEquals(expectedFactorial, actualFactorial, "Факториал " + number + " должен быть равен " + expectedFactorial);
    }

    @Test
    void testFactorialWithPositiveNumber_2() {

        int negativeNumber = -3;
        int expectedFactorialForNegative = 0;

        int actualFactorialForNegative = FactorialExample.main(negativeNumber);

        assertEquals(expectedFactorialForNegative, actualFactorialForNegative, "Факториал " + negativeNumber + " должен быть равен " + expectedFactorialForNegative);
    }
}

