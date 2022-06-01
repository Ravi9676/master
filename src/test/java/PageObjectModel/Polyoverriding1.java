package PageObjectModel;

public class Polyoverriding1 extends Polyoverriding
{
    public int add(int a, int b)
    {
        //int d=super.add(a,b);
       // int e=d+10;
        // System.out.println(e);
        int c=a+b;
        return c;
    }
}
