
package sample;

import java.io.*;
import java.util.*;
public class Sample {

 
 
    public static void main(String[] args)
    {
   int time;
            System.out.println("Enter the time in mins");
    Scanner sc=new Scanner(System.in);
    time=sc.nextInt();
    int hours,h,days,d,years,y;
    hours=time/60;
      h=time%60;
    days=(h+hours)/24;
    d=(h+hours)%24;
    years=(d+days)/365;
    System.out.println(years);
    y=(d+days)%365;
    System.out.println("Ther number of years is:"+years+"Days is:"+y);
    }
    
}
