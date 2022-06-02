package Practice;

public class OverloadingMain {
    public static void main(String[] args) {
        Overloading obj=new Overloading();
        float X=obj.multi(18,8.5f);
        int Z=obj.multi(19,5);
        System.out.println(Z);
        System.out.println(X);
    }
}
