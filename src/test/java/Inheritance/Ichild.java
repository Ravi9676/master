package Inheritance;

public class Ichild implements Iclass,InClass{
    int d=c;
    public int add() {
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }


    public String country() {
        return "usa";
    }

    @Override
    public String ravi() {
        return null;
    }

    public InClass navya(){
        return new Ichild2();




    }
}
