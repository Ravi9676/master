package PageObjectModel;

public class B extends Addition {
      //int a;
    public B(int a) {
        super(a);
    }

    public int add1(){
        int a=super.add();
        int c=a+10;
        return c;
    }
    public int sub()
    {
        int c=a-10;
        return c;

    }

}

