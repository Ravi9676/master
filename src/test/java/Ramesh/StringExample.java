package Ramesh;

public class StringExample {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        String x="Hello";
        String y="World";
        System.out.println("Sum of a&b is:" +(a+b));
        System.out.println("Concatenation of of a,b,x&y is:" +(a+b+x+y));
        System.out.println("Concatenation of of a,b,x&y is:" +(x+y+a+b));
        System.out.println("Concatenation of of a,b,x&y is:" +(a+b+" "+x+" "+y));
        System.out.println("Concatenation of of a,b,x&y is:" +(x+y+(a+b)));
        String mobiles="oneplus";
        String xpath="//a[text()='"+mobiles+"']";
        System.out.println(xpath);


    }
}
