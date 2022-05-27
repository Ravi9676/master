package Inheritance;

public class PolyClass {
    int a;
    public PolyClass(){
        System.out.println("constructor without parameters");
    }

    public PolyClass(int a){
        this.a=a;
        System.out.println("constructor with parameters"+a);
    }

    public int currency(){
        int a=10;
        int b=20;
        int c =a+b;
        return c;
    }

    public int currency(int b){
       int c=a+b;
        return c;
    }
    public float currency(float a,int b) {
        float c = a + b;
        return c;
    }
}
