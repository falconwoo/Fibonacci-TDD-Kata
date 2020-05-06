package kata.tdd.fibonacci;

public class Fibonacci {
    private int index;

    public Fibonacci(int index) {
        this.index = index;
    }

    public long getValue() {
        long value = -1;
        if (index == 1 || index == 2) {
            value = 1;
        }
        if (index > 2) {
            value = new Fibonacci(index - 1).getValue() + new Fibonacci(index - 2).getValue();
        }
        return value;
    }
}
