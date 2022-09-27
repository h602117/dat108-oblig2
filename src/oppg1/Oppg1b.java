package oppg1;

import java.util.function.BiFunction;

public class Oppg1b {

    public static void main(String[] args) {
        System.out.println(calculate(12, 13, (a, b) -> a + b));
        System.out.println(calculate(-5, 3, (a, b) -> Math.max(a, b)));
        System.out.println(calculate(54, 45, (a, b) -> Math.abs(a - b)));
    }

    public static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> func) {
        return func.apply(a, b);
    }
}
