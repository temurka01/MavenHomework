public class Numbers {
    public int plus(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) throws ArithmeticException {
        if (second != 0) {
            return first * second;
        } else {
            throw new ArithmeticException("На ноль умножать нельзя (можно)");
        }
    }

    public int divide(int first, int second) {
        if (second != 0) {
            return first / second;
        } else {
            throw new ArithmeticException("На ноль делить нельзя");
        }
    }

    public int power(int first, int second) {
        if (second > 1) {
            return first * power(first, second - 1);
        }
        return first;
    }
}
