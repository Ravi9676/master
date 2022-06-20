package AccessModifiers;

public class InterfaceMainClass {
    public static void main(String[] args) {
        C obj=new C();
        int result=obj.add(10,50);
        System.out.println(result);
        A obj1=new C();
        int result1=obj1.add(10,30);
        B obj2=new C();
        int result2=obj2.mul(30,40);
        int result3=obj.sub(60,20);
        int result4=obj2.add(50,60);
        System.out.println(result2);
        System.out.println(result3);
    }
}
