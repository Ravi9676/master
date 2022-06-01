package Ramesh;

public class Garbage {
    public static void main(String[] args) {
        Garbage obj=new Garbage();
        obj=null;
        System.gc();
    }
    @Override
    public void finalize(){
        System.out.println("system is calling finalize method");
    }
}
