package AccessModifiers;

public class MainMethod {

    public static void main(String[] args) {
        ConstructorClass obj=new ConstructorClass();
        ConstructorClass obj1=new ConstructorClass("10");
        obj.ConstructorClass();
    }
    /*public static void main(String[] args) {
        PublicExample obj=new PublicExample();
        int c=obj.a;
        System.out.println(c);
        //PrivateExample obj1=new PrivateExample();
        //int k=obj1.a;
        //System.out.println(k);
        ProtectedExample obj2=new ProtectedExample();
        int l=obj2.a;
        System.out.println(l);
        //adding code

        ConstructorClass obj3=new ConstructorClass();
        int c2=obj3.add(10,20);
        ConstructorClass obj4=new ConstructorClass(10);

    }*/
}
