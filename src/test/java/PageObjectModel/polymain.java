package PageObjectModel;

public class polymain {
    public static void main(String[] args) {
        poly obj=new poly();
        int a=obj.currency();
        poly obj1=new poly(15,16);
        float b=obj.currency(11.5f,5);
        System.out.println(a);
        System.out.println(b);
    }
}
