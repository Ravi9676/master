package PageObjectModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class foreach
{
     static int d;
    public static void ravi() throws ArithmeticException
    {
        d=9/0;
        int a=d;
    }
    public static void shankar() throws FileNotFoundException, SQLException
    {
        FileInputStream fs=new FileInputStream("");
        Connection con= DriverManager.getConnection(" ");
    }
    public static void mul() throws Exception
    {
        if(d==0)
        {
            try
            {
                throw new Exception("d value should not equal to 0");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }

        }

    }
    public static void main(String[] args) throws Exception
    {
        mul();
        shankar();
        ravi();

       /* try
        {
      /*  int a[]={10,20,30,40};
        for(int number : a){
            System.out.println(number);
            }
        Thread.sleep(100);
        int a[] = new int [7];
        foreach obj =new foreach();
        obj=null;
        obj.d=20;

        a[7]=11;
        //int b= 11/0 ;
        int length=a.length;
        for(int i=0;i<=length;i++){

        }
    }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("my name is ravi");
   } */


  }
}
