package PageObjectModel;

public class Ascendingorder {
    public static void main(String[] args) {
        int a[] = {6, 2, 8, 5, 1, 4, 9, 3, 7};
        int length = a.length;
        int temp;
        for (int i = 0; i <= length - 1; i++) {
            for (int j = i + 1; j <= length - 1; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
             }
        }
        for (int k = 0; k <= length - 1; k++) {
            System.out.println(a[k]);
        }



    }
}
