package Ramesh;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String s1="My name is Ramesh";
        String reverse="";
        String[] splittedstring=s1.split(" ");
        for(int i=0;i<=splittedstring.length-1;i++){
            reverse=splittedstring[i]+" "+reverse;
        }
        System.out.println(reverse);
    }
}
