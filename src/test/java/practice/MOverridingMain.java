package practice;

public class MOverridingMain {
    public static void main(String[] args) {
        MOverridingChild obj=new MOverridingChild();
        int c=obj.add(1,2);
        int d= obj.sub(2,1);
        System.out.println(c);
        System.out.println(d);
        MOverridingParent obj1 =new MOverridingChild();
        int f= obj1.sub(2,2);
        System.out.println(f);


    }
}
