import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateVacationTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Data.csv")
    public void shouldNonWorkingMonths(int expected, int income, int expenses, int threshold) {
        CalculateVacation service = new CalculateVacation();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldNonWorkingMonthsSecondTest() {
//        CalculateVacation service = new CalculateVacation();
//        int expected = 3;
//        int actual = service.calculate();
//        Assertions.assertEquals(expected, actual);
//    }

}
