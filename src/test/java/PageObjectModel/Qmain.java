package PageObjectModel;

public class Qmain
{
    public static void main(String args[])
    {
        Q2 obj=new Q2();
        int result=obj.add(1,2);
        System.out.println(result);
        float R1=obj.add(2.5f,6);
        System.out.println(R1);
        Q1 obj1=new Q1();
        int R2=obj.add(2,2);

    }



}
