package calander;
import java.util.*;
import java.text.*;
public class Second_Count1 {
    static int interval;
    static Timer timer;
    int m,d,t;
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Input seconds => : ");
    String secs = sc.nextLine();
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = Integer.parseInt(secs);
    System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            System.out.println(setInterval());
        }
    }, delay, period);
    }
    private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
    return --interval;
    }

}
