package practice;

public class AddingDays {
    public static void main(String[] args) {
        String s1="23/05/2022";
        String s2="";
        String[] splitted=s1.split("/");
        String day=splitted[0];
        //converting string to integer
        int futureday=Integer.parseInt(day)+5;
        //converting int to string
        String actualday=String.valueOf(futureday);
        System.out.println(actualday+"/"+splitted[1]+"/"+splitted[2]);
    }
}
