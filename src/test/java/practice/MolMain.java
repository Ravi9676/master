package practice;

public class MolMain {
    public static void main(String[] args) {
        MolClass obj=new MolClass();
        MolClass obj2=new MolClass (5);
        float a=obj.add();
        int b=obj.add(2,2);
        int c=obj.mul(2,2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
