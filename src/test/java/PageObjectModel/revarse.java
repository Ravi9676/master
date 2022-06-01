package PageObjectModel;

public class revarse {
    /*public static void main(String[] args) {
        String s1="My name is Ravi";
        String revarsestring=" ";
        int length=s1.length();
        String[] Splittedstring=s1.split(" ");
        for(int i=0;i<=Splittedstring.length-1;i++){
            revarsestring=Splittedstring[i]+" "+revarsestring;
        }
        System.out.println(revarsestring);
    }

    public static void main(String[] args) {
        String s2="My name is shankar";
        String revarse2=" ";
        for(int i=0;i<=s2.length()-1;i++){
            revarse2= s2.charAt(i)+revarse2;
        }
        System.out.println(revarse2);
    }*/

    public static void main(String[] args) {
        String s1="23/05/2022";
        String s2=" ";
        String[] splitted=s1.split("/");
        String day=splitted[0];
        int futureday=Integer.parseInt(day)+5;//converting string to integer;

        //String actualday=String.Valueof(futureday); converting int to string;

        System.out.println(futureday+"/"+splitted[1]+"/"+splitted[2]);
    }
        String s1= "27/02/2022";
        String s2=" ";
        String[] split=s1.split("/");
        String day=split[0];
        
}
