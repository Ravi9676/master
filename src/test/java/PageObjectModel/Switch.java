package PageObjectModel;

public class Switch {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int length=a.length;
        for(int i=0;i<=length-1;i++){
            if(a[i]==40){
                System.out.println(a[i]+a[i-1]);
                continue;
            }
            System.out.println(a[i]);
        }
    }
}
