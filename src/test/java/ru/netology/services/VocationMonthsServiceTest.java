package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VocationMonthsServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Month.csv")
    void shouldCalculateMonthsVocations3(int expected,int income, int expenses,int threshold ) {
        VocationMonthsService calculation = new VocationMonthsService();
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);
    }
}