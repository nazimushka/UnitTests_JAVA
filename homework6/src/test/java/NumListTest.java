import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты - NumberList")
class NumListTest {
    private NumberList<Integer> integerList;
    private NumberList<Double> doubleList;

    @BeforeEach
    void setUp() {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> doubles = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5));

        integerList = new NumberList<>(integers);
        doubleList = new NumberList<>(doubles);
    }

    @Test
    @DisplayName("Тест calculateAverage с пустым списком")
    void calculateAverageWithEmptyList() {
        NumberList<Integer> emptyList = new NumberList<>(new ArrayList<>());
        assertEquals(0.0, emptyList.calculateAverage());
    }

    @Test
    @DisplayName("Тест calculateAverage с целочисленными значениями")
    void calculateAverageWithIntegerList() {
        assertEquals(3.0, integerList.calculateAverage());
    }

    @Test
    @DisplayName("Тест calculateAverage с вещественными числами")
    void calculateAverageWithDoubleList() {
        assertEquals(3.5, doubleList.calculateAverage());
    }

    @Test
    @DisplayName("Тест compareTo с целочисленными значениями")
    void compareToWithIntegerList() {
        NumberList<Integer> anotherIntegerList = new NumberList<>(Arrays.asList(6, 7, 8, 9, 10));
        assertTrue(integerList.compareTo(anotherIntegerList) < 0);
    }

    @Test
    @DisplayName("Тест compareTo с вещественными числами")
    void compareToWithDoubleList() {
        NumberList<Double> anotherDoubleList = new NumberList<>(Arrays.asList(6.5, 7.5, 8.5, 9.5, 10.5));
        assertTrue(doubleList.compareTo(anotherDoubleList) < 0);
    }
}
