package AccessModifiers;

public class Mainclass {
    public static void main(String[] args) {
        Child1 obj=new Child1();
        Child2 obj1=new Child2();
        int c=obj.sub();
        int d=obj.add(10,20);
        int e=obj1.mul();
        int f= obj1.add(10,30);

    }
}
