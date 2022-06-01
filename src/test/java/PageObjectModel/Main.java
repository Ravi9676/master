package PageObjectModel;

public class Main
{
    public static void main(String[] args)
    {
        B obj=new B(21);
        int z=obj.add1();
        int e=obj.sub();
        System.out.println(e);
        System.out.println(z);
    }
}
