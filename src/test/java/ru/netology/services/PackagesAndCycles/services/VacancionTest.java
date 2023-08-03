package ru.netology.services.PackagesAndCycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Field;
// import ru.netology.services.PackagesAndCycles.services.Vacancion;

public class VacancionTest {

    @ParameterizedTest
    //@CsvSource({
    //        "3,10000,3000,20000",
    //        "2,100000,60000,150000"
    //})
    @CsvFileSource(files="src/test/resources/VacancionCsv")
    public void testCalcVacancion(int expected, int income, int expenses, int threshold) {
        Vacancion service = new Vacancion();

        //int expected = 3;
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void testcalculatedvacationtwo() {
        //Vacancion service = new Vacancion();
        //
        // int expected = 2;
        // int income = 100_000;
        // int expenses = 60_000;
        // int threshold = 150_000;
        //int actual = service.calculate(income, expenses, threshold);
        //
        //Assertions.assertEquals(expected, actual);
        // }
}
