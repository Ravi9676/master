package PageObjectModel;

public class Duplicatenos {
    public static void main(String[] args) {
        int count=1;
        int a[]={1,2,3,5,8,1,3,6,5,8,1,1};
        int length=a.length;
        for(int i=0;i<=length-1;i++){
            for(int j=i+1;j<=length-1;j++){
                if(a[i]==a[j]){
                    count=count+1;
                }
            }
            if(count>1){
                System.out.println(a[i]);
                count=1;
            }
        }
    }
}
