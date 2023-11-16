package ru.netology.homework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freemonth.csv")
    public void TestFreeMonth(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int actual = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected,actual);

    }
}