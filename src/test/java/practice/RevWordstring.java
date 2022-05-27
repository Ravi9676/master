package practice;

public class RevWordstring {
    /*public static void main(String[] args) {
        String reverse="";
        String s1="my name is navya";
        String[] splittedstring=s1.split(" ");
        for(int i=0;i<=splittedstring.length-1;i++){
            reverse=splittedstring[i]+" "+reverse;
        }

        System.out.println(reverse);
    }
*/

    public static void main(String[] args) {
        String s1="My name is Navyasri";
        String reverse="";
        for(int i=0;i<=s1.length()-1;i++){
            reverse=s1.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }

}
