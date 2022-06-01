package practice;

public class AvgofHnumbers {
    static int sum;

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        int avg = sum / 100;
        System.out.println(avg);
    }
}
