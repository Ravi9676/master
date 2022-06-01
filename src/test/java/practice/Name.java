package practice;

public class Name {
    public static void main(String[] args) {
        String output="";
        String s1="my name is Naveen";
        int startposition=s1.indexOf("Naveen");
        int endposition1=s1.indexOf('n',startposition);
        System.out.println(s1.substring(startposition,endposition1));
       // System.out.println(s1.replaceAll("navya","ravi"));
        System.out.println(s1.indexOf('n',4));
        int position=s1.indexOf("name");
        int endposition=s1.indexOf("Naveen");
        System.out.println(s1.substring(position));
        System.out.println(s1.substring(position,endposition));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.replaceAll(" ",""));
        System.out.println(s1.charAt(3));
        char[] ch=s1.toCharArray();
        System.out.println(ch[5]);
        System.out.println(s1.lastIndexOf(s1));
        String[] s2=s1.split(" ");
        for(int i=0;i<=s2.length-1;i++){
            if(s2[i].equalsIgnoreCase("Navya")){
                s2[i]="ravi";
            }
            output=output+" "+s2[i];
        }
        System.out.println(output);

    }
}
