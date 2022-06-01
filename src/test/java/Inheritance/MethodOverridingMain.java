package Inheritance;

public class MethodOverridingMain {
    public static void main(String[] args) {
        //static overriding
        MethodOverridingChild obj=new MethodOverridingChild();
        int c= obj.add(10,20);

        System.out.println(c);
        //dynamic overriding
        PolyMethodOverridingParent obj1=new MethodOverridingChild();
        int res=obj1.add(20,20);
        System.out.println(res);

        PolyMethodOverridingParent obj2=new PolyMethodOverridingParent();
        int res1=obj1.add(20,10);
        System.out.println(res1);

    }
}
