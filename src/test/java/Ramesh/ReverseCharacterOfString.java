package Ramesh;

public class ReverseCharacterOfString {
    public static void main(String[] args) {
        String s1="My name is Ramesh";
        String reverse="";
        for(int i=0;i<=s1.length()-1;i++){
            reverse=s1.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
