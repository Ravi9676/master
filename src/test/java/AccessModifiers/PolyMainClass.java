package AccessModifiers;

public class PolyMainClass {
    public static void main(String[] args) {
        ChildClass obj=new ChildClass();
        int result=obj.add(10,30);
        System.out.println(result);
        float result1=obj.add(20.5f,30);
        System.out.println(result1);
        PolyClass obj2=new PolyClass();
        PolyClass obj1= new ChildClass();
        int result3=obj1.add(10,40);
        System.out.println(result3);
    }
}
