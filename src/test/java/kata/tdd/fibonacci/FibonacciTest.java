package kata.tdd.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    void should_return_1_when_get_fibonacci_given_index_is_1 (){
        int index = 1;

        long fibonacciValue = new Fibonacci(index).getValue();

        assertEquals(1, fibonacciValue);
    }

    @Test
    void should_return_1_when_get_fibonacci_given_index_is_2 (){
        int index = 2;

        long fibonacciValue = new Fibonacci(index).getValue();

        assertEquals(1, fibonacciValue);
    }

    @Test
    void should_return_55_when_get_fibonacci_given_index_is_10 (){
        int index = 10;

        long fibonacciValue = new Fibonacci(index).getValue();

        assertEquals(55, fibonacciValue);
    }

    @Test
    void should_return_12586269025_when_get_fibonacci_given_index_is_50 (){
        int index = 50;

        long fibonacciValue = new Fibonacci(index).getValue();

        assertEquals(12586269025L, fibonacciValue);
    }
}
