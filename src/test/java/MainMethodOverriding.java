public class MainMethodOverriding {
    public static void main(String[] args) {
        MethodOverridingChild obj=new MethodOverridingChild();
        int c=obj.add(10,20);
        PolyMethodOverRidingParent obj1=new MethodOverridingChild();
        System.out.println(obj1.add(20,20));
    }
}
