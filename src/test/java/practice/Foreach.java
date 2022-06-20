package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Foreach {
   static int d;
    public  static void add() throws ArithmeticException{
        d=9/0;
        int a=d;
    }
    public static void sub() throws FileNotFoundException, SQLException {
        FileInputStream fs=new FileInputStream("");
        Connection con= DriverManager.getConnection(" ");
    }
    public static void mul()  {
        if (d==0) {
            try{

                throw new Exception("d value should not be equals to zero");

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        mul();
        sub();
        add();


       /* try {
            Thread.sleep(300);
            int a[] = new int[7];
            Foreach obj = new Foreach();
            obj = null;
            obj.d = 20;
            a[7] = 11;
            //  int b=11/0;
            int length = a.length;
            for (int i = 0; i <= length; i++) {
                //  for(int number :a){
                System.out.println(a[i]);
            }

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("my name is navya");
        }*/

    }
    }


