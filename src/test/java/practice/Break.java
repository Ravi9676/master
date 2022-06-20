package practice;

public class Break {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90};
        int length=a.length;
        for (int i=0;i<=length-1;i++){
            if(a[i]==40){
                System.out.println(a[i]);
                break;
            }
           System.out.println(a[i]);
        }
    }
}
