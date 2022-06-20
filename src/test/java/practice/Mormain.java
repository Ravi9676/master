package practice;

public class Mormain {
    public static void main(String[] args) {
        MorChild obj=new MorChild();
        int c= obj.sub(10,20);
        int d=obj.mul(2,1);
        System.out.println(c);
        System.out.println(d);
        MorParent obj1=new MorChild();
        int e=obj1.sub(2,3);
        System.out.println(e);
    }
}