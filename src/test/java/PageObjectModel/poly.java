package PageObjectModel;

public class poly
{
    int a;
    public poly(){

        System.out.println("constructor without parameters");
    }
    public poly(int a,int b)
    {
        this.a=a;
        System.out.println("constructor with parameters"+a);
    }
    public int currency()
    {
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }

    public int currency(int a)
    {
        int b=70;
        int c= a+b;
        return c;
    }
    public float currency(float a,int b)
    {
        float c=a+b;
        return c;
    }

}
