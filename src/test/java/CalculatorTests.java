import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
    @Test
    public void shouldAddTwoNumbers() {
        int sum = arithmeticOperations.getAddition(15, 20);
        Assert.assertEquals(35,sum);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = arithmeticOperations.getMultiply(10,20);
        Assert.assertEquals(200, result);
    }

    @Test
    public void ShouldGetSubtraction() {
        int result = arithmeticOperations.getSubtraction(10, 20);
        Assert.assertEquals(10, result);
    }
    @Test
    public void ShouldGetRemainderTwoNumbers() {
        int result= arithmeticOperations.getRemainder(20,10);
        Assert.assertEquals(2, result);
    }

}
