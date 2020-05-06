package kata.tdd.fibonacci;

public class Fibonacci {
    private int index;

    public Fibonacci(int index) {
        this.index = index;
    }

    public int getValue() {
        int value = -1;
        if (index == 1) {
            value = 1;
        }
        return value;
    }
}
