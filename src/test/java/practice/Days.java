package practice;

public class Days {
    public static void main(String[] args) {
        int noofdays=6;
        int futureday = 0;
        String month="";
        String year="";
        String s1 = "26/01/2022";
        String  s2 = " ";
        String[] Splitted = s1.split("/");
        String day = Splitted[0];
        if (Integer.parseInt(Splitted[1]) == 2)
        {
            futureday = Integer.parseInt(day) + noofdays;
            if (futureday > 28)
            {
                int febdays = 28;
                int remainingdays = febdays - Integer.parseInt(Splitted[0]);
                futureday=(futureday-Integer.parseInt(Splitted[0]));
                futureday = futureday - remainingdays;
                month=String.valueOf(Integer.parseInt(Splitted[1])+1);
                year=Splitted[2];
            }
            else
            {
                //converting string to integer
                //futureday=Integer.parseInt(day)+5;
                //converting int to string
                //String actualday=String.valueOf(futureday);
                month=Splitted[1];
                year=Splitted[2];
            }
        }
       else if ((Integer.parseInt(Splitted[1])) == 4||(Integer.parseInt(Splitted[1])) ==6||(Integer.parseInt(Splitted[1])) == 9||(Integer.parseInt(Splitted[1])) == 11)
        {
            futureday=Integer.parseInt(day)+noofdays;
            if (futureday>30)
            {
                int i=0;
                int j=1;
                int k=0;
                int days=30+i;

                    int remainingdays=days-Integer.parseInt(Splitted[0]);
                    futureday=(futureday-Integer.parseInt(Splitted[0]));
                    futureday=futureday-remainingdays;
                    if(futureday>31)
                    {
                        //remainingdays=futureday-31;
                        futureday=futureday-31;
                        j++;
                        month=String.valueOf(Integer.parseInt(Splitted[1])+j);
                        if(Integer.parseInt(month)>12)
                        {
                            month=String.valueOf(Integer.parseInt(month)-12);
                            k++;
                            year=String.valueOf(Integer.parseInt(Splitted[2])+k);
                        }
                        else
                        {
                            year = String.valueOf(Integer.parseInt(Splitted[2]) + k);
                        }
                    }
                    else
                    {
                        month=String.valueOf(Integer.parseInt(Splitted[1])+j);
                        year=String.valueOf(Integer.parseInt(Splitted[2])+k);
                    }



            }
            else
            {
                //converting string to integer
                //futureday=Integer.parseInt(day)+5;
                //converting int to string
                //String actualday=String.valueOf(futureday);
                month=Splitted[1];
                year=Splitted[2];
            }

        }
       else if((Integer.parseInt(Splitted[1]))==1||(Integer.parseInt(Splitted[1]))==3||(Integer.parseInt(Splitted[1]))==5||(Integer.parseInt(Splitted[1]))==7||(Integer.parseInt(Splitted[1]))==8||(Integer.parseInt(Splitted[1]))==10||(Integer.parseInt(Splitted[1]))==12){
            futureday=Integer.parseInt(day)+noofdays;
            if(futureday>31)
            {
                int days=31;
                int remainingdays = days - Integer.parseInt(Splitted[0]);
                futureday=(futureday-Integer.parseInt(Splitted[0]));
                futureday = futureday - remainingdays;
                if((Integer.parseInt(Splitted[1]))==12){
                    month=String.valueOf(1);
                    year=String.valueOf(Integer.parseInt(Splitted[2])+1);

                }
                else
                {
                    month = String.valueOf(Integer.parseInt(Splitted[1]) + 1);
                    year = Splitted[2];
                }
            }
            else
            {
                //converting string to integer
                //futureday=Integer.parseInt(day)+5;
                //converting int to string
                //String actualday=String.valueOf(futureday);
                month=Splitted[1];
                year=Splitted[2];
            }
       }
       else
       {
           //converting string to integer
            futureday=Integer.parseInt(day)+noofdays;
           //converting int to string
           String actualday=String.valueOf(futureday);
           month=Splitted[1];
           year=Splitted[2];
        }
        String updateddate=String.valueOf(futureday)+"/"+month+"/"+year;
        System.out.println(updateddate);
    }
}

