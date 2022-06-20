package practice;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, count = 10;
        for (int i = 2; i <= count; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
        }
    }
}

