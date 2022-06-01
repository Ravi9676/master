package Ramesh;

public class Exceptions {
    public static void main(String[] args) {
        try {
            //Thread.sleep(300);
            int a[] = new int[7];
            // ExceptionHandling obj=new ExceptionHandling();
            //obj=null;
            //obj.d=20;
          a[7] = 11;
           // int b=11/0;
            int length = a.length;
            for (int i = 0; i <= length; i++) {
                System.out.println(a[i]);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}