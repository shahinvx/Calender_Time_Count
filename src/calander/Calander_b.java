package calander;

import java.util.*;

public class Calander_b {
    public static void main(String[] args){
        int i, j ,k;
        Scanner s = new Scanner(System.in);
        int yr=2018;
        while(yr<=2050)
        {
            System.out.println("For Year :"+yr);
        for(i=1; i<=12; i++)
        {
            if(i<=7)
            {
                if(i%2!=0 && i!=2)
                {
                    for(j=1; j<=31; j++)
                    {
                        System.out.println("Month "+i+ " Day"+j);
                    }
                }
                else if(i==2)
                {
                    if(yr%4==0)
                    {
                    if(yr%100==0)
                    {
                        if(yr%400==0)
                        {
                            for(j=1; j<=29; j++)
                            {
                                System.out.println("Month "+i+ " Day"+j);
                            }
                        }else
                        {
                            for(j=1; j<=28; j++)
                            {
                                System.out.println("Month "+i+ " Day"+j);
                            }
                        }
                    }else
                    {
                        for(j=1; j<=29; j++)
                            {
                                System.out.println("Month "+i+ " Day"+j);
                            }
                    }
                }else
                    {
                        for(j=1; j<=28; j++)
                            {
                                System.out.println("Month "+i+ " Day"+j);
                            }
                    }
                }
                else
                {
                    for(j=1; j<=30; j++)
                    {
                        System.out.println("Month "+i+ " Day"+j);
                    }
                }
            }else
            {
                if(i%2!=0)
                {
                    for(j=1; j<=30; j++)
                    {
                System.out.println("Month "+i+ " Day"+j);
                    }
                }
                else
                {
                    for(j=1; j<=31; j++)
                    {
                System.out.println("Month "+i+ " Day"+j);
                    }
                }
            }
        }
        yr++;
        }
    }

}
