package AccessModifiers;



public class ConstructorClass1
{
        int a;
        int b;
        public  ConstructorClass1(int a,int b)
        {
           a=this.a;
           b=this.b;
        }

        public int sub(){
            int c=a-b;
            return  c;
        }

        public void names(String name){
            System.out.println(name);
        }
}
