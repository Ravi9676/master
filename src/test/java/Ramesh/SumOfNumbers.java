package Ramesh;

public class SumOfNumbers {
   static int sum;

    public static void main(String[] args) {
       // int sum=0;
        //SumOfNumbers obj=new SumOfNumbers();
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        int avg=sum/100;
        System.out.println(avg);
    }

}
