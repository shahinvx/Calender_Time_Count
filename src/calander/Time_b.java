package calander;
import java.util.*;
import java.text.*;
public class Time_b {
    public static void main(String[] args)
    {
        
      Calendar cal = Calendar.getInstance();   // GregorianCalendar
      System.out.println("Time zone is: " + cal.getTimeZone() + "\n");
  
      // An Easier way to print the timestamp by getting a Date instance
      Date date = cal.getTime();
        
      System.out.println("Hour  : " + cal.get(Calendar.HOUR));
      System.out.println("AM PM : " + cal.get(Calendar.AM_PM));
      System.out.println("Hour of the Day : " + cal.get(Calendar.HOUR_OF_DAY));
      System.out.println("Minute : " + cal.get(Calendar.MINUTE));
      System.out.println("Second : " + cal.get(Calendar.SECOND));
      int i=1;
      while(i!=0)
      {
          if(cal.get(Calendar.SECOND)!=0)
          {
              i++;
              //System.out.println(i);
              
              System.out.println("Second : " + cal.get(Calendar.SECOND));
          }
      }
      System.out.println();
    }
}
