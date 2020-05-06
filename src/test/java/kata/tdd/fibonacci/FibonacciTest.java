package kata.tdd.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void should_return_1_when_get_fibonacci_given_index_is_1 (){
        int index = 1;

        int fibonacciValue = new Fibonacci(index).getValue();

        assertEquals(1, fibonacciValue);
    }
}
