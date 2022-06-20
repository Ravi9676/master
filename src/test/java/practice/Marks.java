package practice;

public class Marks {
    public static void main(String[] args) {
        int marks=20;
        if(marks>=60&&marks<=100){
            System.out.println("firstclass");
        }
        else if(marks>=50&&marks<=59){
            System.out.println("Secondclass");
        }
        else if(marks>=35&&marks<=49){
            System.out.println("Thirdclass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
