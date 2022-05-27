package practice;

public class DuplicateNumbers {
    public static void main(String[] args) {


        int count = 1;
        int a[] = {1, 2, 3, 4, 5, 1, 4, 6, 7, 5};

        {
            for (int i = 0; i <= a.length; i++) {
                for (int j = i + 1; j <= a.length - 1; j++) {
                    if (a[i] == a[j]) {
                        count = count + 1;
                    }
                }
                if (count > 1) {

                    System.out.println(a[i]);
                    count = 1;
                }
            }

        }
    }
}
