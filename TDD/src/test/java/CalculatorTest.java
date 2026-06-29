/* Step1: RED - write a failing test
** with method that adds two positive numbers
* */

import com.github.TebogoP.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addTwoPositiveNumbers() {
        Calculator calc = new Calculator();  // doesn't exist yet!
        int result = calc.add(3, 5);
        assertEquals(8, result);
    }
}
