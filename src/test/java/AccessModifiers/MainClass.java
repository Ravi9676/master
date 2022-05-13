package AccessModifiers;

public class MainClass {
    public static void main(String[] args) {
        Child1 obj=new Child1();
        Child2 obj1=new Child2();
        int result=obj.sub();
        int result1=obj.add(10,20);
        int result2=obj1.mult();
        int result3=obj1.add(10,30);
    }
}
