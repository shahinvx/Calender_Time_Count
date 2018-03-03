package calander;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author SAYOn
 */
public class MTimer {
    Calendar cal=Calendar.getInstance();
    int sp=cal.get(Calendar.SECOND),h=cal.get(Calendar.HOUR_OF_DAY),m=cal.get(Calendar.MINUTE);
    String dn;
    Timer Mtime=new Timer();
    TimerTask task=new TimerTask()
    {
        public void run()
        {
            
            if(sp>59)
            {
                m=m+1;
                sp=0;
                
            }
            if(m>59)
            {
                h=h+1;
                m=0;
                sp=0;
            }
            if(h>12)
            {
                h=h-12;
            }
            if(h<10)
                System.out.print("0"+h + ":");
            else
                System.out.print(h + ":");
            if(m<10)
                System.out.print("0"+m + ":");
            else
                System.out.print(m + ":");
            if(sp<10)
                System.out.print("0"+sp + ":");
            else
                System.out.print(sp + ":");
            if(cal.get(Calendar.AM_PM)==1)
                System.out.println("PM");
            else
                System.out.println("AM");
            System.out.println();
            sp++;
        }
    };
    public void start()
    {
        Mtime.scheduleAtFixedRate(task,1000,1000);
    }
    
    public static void main(String[] args){
        MTimer tm=new MTimer();
        tm.start();
    }
}
