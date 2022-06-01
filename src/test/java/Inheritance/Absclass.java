package Inheritance;

public class Absclass extends AbstractClass{
    @Override
    public void add() {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public void mul(){
        int a=5;
        int b=5;
        int c=a*b;
        System.out.println(c);
    }
}
