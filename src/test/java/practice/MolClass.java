package practice;

public class MolClass {
    int a;
    public MolClass(){System.out.println("navyasri");}
    public MolClass(int a){
       this.a=a;
        System.out.println("navyasri"+a);
    }
    public float add(){
        float a=20.1f;
        float b=10.2f;
        float c=a+b;
        return c;
    }
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int mul(int c,int d) {
        int e = c * d;
        return e;
    }

}
