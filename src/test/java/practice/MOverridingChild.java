package practice;

public class MOverridingChild extends MOverridingParent {
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;
    }
}
