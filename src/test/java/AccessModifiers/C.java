package AccessModifiers;

public class C implements A,B{

    @Override
    public int add(int a, int b) {
        int c=a+b;
        return c;

    }
    public int sub(int a,int b) {
        int c=a-b;
        return c;

    }

    @Override
    public int mul(int a, int b) {
        int c=a*b;
        return c;
    }
}
