import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void beforeEachMethod(){
        calculator = new Calculator();
    }

    @Test
    void sumPositive() {
        int value1= 1; int value2 =3; int value3 =5;

        int expected = value1 + value2 + value3;
        int result = calculator.sum(value1,value2,value3);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiplyPositive() {
        int value1= 1; int value2 =3; int value3 =5;

        int expected = value1 * value2 * value3;
        int result = calculator.multiply(value1, value2, value3);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtractPositive() {
        int value1= 1; int value2 =3; int value3 =5;

        int expected = value1 - value2 - value3;
        int result = calculator.subtract(value1, value2, value3);

        Assertions.assertEquals(expected, result);
    }
}