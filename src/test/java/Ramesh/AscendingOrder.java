package Ramesh;

public class AscendingOrder {
    public static void main(String[] args) {
        int a[]={6,2,1,5,8,7,9,10,3,4};
        int length=a.length;
        int temp;
        for(int i=0;i<=length-1;i++){
            for(int j=i+1;j<=length-1;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int k=0;k<=length-1;k++){
            System.out.println(a[k]);
        }

    }
}
