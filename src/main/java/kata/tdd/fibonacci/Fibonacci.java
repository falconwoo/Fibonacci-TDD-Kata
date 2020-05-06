package kata.tdd.fibonacci;

public class Fibonacci {
    private int index;

    public Fibonacci(int index) {
        this.index = index;
    }

    public long getValue() {
        long value = -1;
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        if (index == 1 || index == 2) {
            value = 1;
        }
        if (index > 2) {
            long fn_2 = 1;
            long fn_1 = 1;
            long fn = 0;
            for (int i = 0; i < index - 2; i ++){
                fn = fn_2 + fn_1;
                fn_2 = fn_1;
                fn_1 = fn;
            }
            value = fn;
        }
        return value;
    }


}
