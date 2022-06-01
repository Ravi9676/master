package Ramesh;

public class Revchar {
    public static void main(String[] args) {
        String s1="My name is Ramesh";
        String output="";
        char[] ch=s1.toCharArray();
        for(int i=0;i<=ch.length-1;i++){
            output=ch[i]+output;
        }
        System.out.println(output);
    }
}
