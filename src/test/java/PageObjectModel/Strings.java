package PageObjectModel;

public class Strings {
    public static void main(String[] args) {
     /*   int a=100;
        int b=200;
        String x="hello";
        String y="World";
        System.out.println("sum of a&b is:"+(a+b));
        System.out.println("concatenaion of a,b,x,y:"+ (a+b+" "+x+y));
        String Mobiles="Oneplus";
        String xpath="//a[text()=+'"+Mobiles+"']";
        System.out.println(xpath);
    */
        String output="";
        String s1="my name is ravi";
       /* String[]s2=s1.split(" ");
        for (int i=0;i<= s2.length-1;i++){
            if(s2[i].equalsIgnoreCase("Ravi")){
                s2[i]="shankar";
            }
            output=output+" "+s2[i];
        }
        System.out.println(output);*/

        //////OR//////////
      //  String output="";
        //String s1="my name is ravi";
        int position=s1.indexOf("name");
        int endposition=s1.indexOf("ravi");

        System.out.println(s1.replaceAll("ravi","shankar"));
        System.out.println(s1.indexOf('r',2));
        System.out.println(s1.substring(position));
        System.out.println(s1.substring(position,endposition));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.replaceAll(" ",""));
        System.out.println(s1.charAt(6));
        char ch[]=s1.toCharArray();
        System.out.println(ch.length);
        System.out.println(ch[5]);
        System.out.println(s1.lastIndexOf(s1));
        char[] c=s1.toCharArray();
        for (int i=0;i<=ch.length-1;i++){
            output=c[i]+output;
        }
        System.out.println(output);




    }
}
