package practice;

public class Stringclass {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        String x="hello";
        String y="world";
        System.out.println("sum of a&b is:"+(a+b));
        System.out.println("Concatenation of a,b,x&y is:"+(a+b+" "+x+" "+y));
        System.out.println("Concatenation of a,b,x&y is:"+(x+y+(a+b)));
        String mobiles="oneplus";
        String xpath="//a[text()='"+mobiles+"']";
        System.out.println(xpath);



    }
}
