import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("1 1 +");
        assertEquals(2, result);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("2 1 -");
        assertEquals(1, result);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("2 2 *");
        assertEquals(4, result);
    }

    @Test
    public void shouldCalculateWithSpaces() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("2 2         *");
        assertEquals(4, result);
    }

    @Test
    public void shouldCalculateWithNegativeNumbers() {
        int result = reversePolishNotationCalculator.calculatePolishNotation("-4 2 +");
        assertEquals(-2, result);
    }
}
