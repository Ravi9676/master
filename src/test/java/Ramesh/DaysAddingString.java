package Ramesh;

public class DaysAddingString {
    public static void main(String[] args) {
        String s1="23/05/2022";
        String s2="";
        String[] splitted=s1.split("/");
        String day=splitted[0];
        int futureday=Integer.parseInt(day)+5;
        System.out.println(futureday+"/"+splitted[1]+"/"+splitted[2]);

    }
}
