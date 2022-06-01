package PageObjectModel;

public class Pcmain
{
    public static void main(String args[]){
        Pc2 obj=new Pc2();
        Pc3 obj1=new Pc3();
        int a=obj.add(2,5);
        int q=obj1.multi(a);
        int l=obj.sub(a);
        System.out.println(q);
        System.out.println(l);


    }
}
