package Ramesh;

public class Days {
    public static void main(String[] args) {
        int noOfDays=20;
        int futureDay=0;
        String month="";
        String year="";
        String s1="12/12/2022";
        String s2=" ";
        String[] splitted=s1.split("/");
        String day=splitted[0];
        if(Integer.parseInt(splitted[1])==2){
            futureDay=Integer.parseInt(day) + noOfDays;
            if(futureDay>28){
                int febdays=28;
                int remainingdays=febdays-Integer.parseInt(splitted[0]);
                futureDay=(futureDay-Integer.parseInt(splitted[0]));
                futureDay=futureDay-remainingdays;
                month=String.valueOf(Integer.parseInt(splitted[1])+1);
                year=splitted[2];
            }
            else{
                //converting string to integer
                //futureDay=Integer.parseInt(day)+5;
                //converting int to string
                //String actualday=String.valueOf(futureDay);
                month=splitted[1];
                year=splitted[2];
            }
        } else if ((Integer.parseInt(splitted[1]))==4||(Integer.parseInt(splitted[1]))==6||(Integer.parseInt(splitted[1]))==9||(Integer.parseInt(splitted[1]))==11) {
            futureDay=Integer.parseInt(day)+noOfDays;
            if (futureDay>30){
                int i=0;
                int j=1;
                int k=0;
                int days=30+i;
                int remainingdays=days-Integer.parseInt(splitted[0]);
                futureDay=(futureDay-Integer.parseInt(splitted[0]));
                futureDay=futureDay-remainingdays;
                if(futureDay>31){
                    //remainingdays=futureday-31;
                    futureDay=futureDay-31;
                    j++;
                    month=String.valueOf(Integer.parseInt(splitted[1])+j);
                    if (Integer.parseInt(month)>12){
                        month=String.valueOf(Integer.parseInt(month)-12);
                        k++;
                        year=String.valueOf(Integer.parseInt(splitted[2])+k);
                    }
                    else{
                        year=String.valueOf(Integer.parseInt(splitted[2])+k);
                    }
                }
                else{
                    month=String.valueOf(Integer.parseInt(splitted[1])+j);
                    year=String.valueOf(Integer.parseInt(splitted[2])+k);
                }
            }
            else {
                //converting string to integer
                //futureDay=Integer.parseInt(day)+5;
                //converting int to string
                //String actualday=String.valueOf(futureDay);
                month=splitted[1];
                year=splitted[2];
            }

        }
        else if ((Integer.parseInt(splitted[1]))==1||(Integer.parseInt(splitted[1]))==3||(Integer.parseInt(splitted[1]))==5||(Integer.parseInt(splitted[1]))==7||(Integer.parseInt(splitted[1]))==8||(Integer.parseInt(splitted[1]))==10||(Integer.parseInt(splitted[1]))==12){
            futureDay=Integer.parseInt(day)+noOfDays;
            if (futureDay>31){
                int days=31;
                int remainingdays=days-Integer.parseInt(splitted[0]);
                futureDay=(futureDay-Integer.parseInt(splitted[0]));
                futureDay=futureDay-remainingdays;
                if ((Integer.parseInt(splitted[1]))==12){
                    month=String.valueOf(1);
                    year=String.valueOf((Integer.parseInt(splitted[2]))+1);

                }
                else{
                    month=String.valueOf((Integer.parseInt(splitted[1]))+1);
                    year=splitted[2];
                }

            }
            else{
                //converting string to integer
                //futureDay=Integer.parseInt(day)+5;
                //converting int to string
                //String actualday=String.valueOf(futureDay);
                month=splitted[1];
                year=splitted[2];
            }

            }
        else{
            //converting string to integer
            //futureDay=Integer.parseInt(day)+5;
            //converting int to string
            String actualday=String.valueOf(futureDay);
            month=splitted[1];
            year=splitted[2];
        }
        String updateddate=String.valueOf(futureDay)+"/"+month+"/"+year;
        System.out.println(updateddate);

    }
}

