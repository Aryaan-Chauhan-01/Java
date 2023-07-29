import java.io.*;
import java.util.*;
/**
 *
 * @author DELL
 */
public class cat1q1 {

    public static void main(String[] args) {
        int i,n;
        int[] bp=new int[5];
        int[] bt=new int[5];
        int[] t=new int[5];
        String c;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter A for Domestic, B for partly commercial, C for institution or D for commercial");
            c=sc.next();
            System.out.println("Enter the billing period and duration in months");
            bp[i]=sc.nextInt();
            bt[i]=sc.nextInt();
            if(c=="A")
                     t[i]=(80)*bt[i];
            else if(c == "B")
                     t[i]=(263)*bt[i];
            else if(c=="C")
            {
                     System.out.println("Enter 1 for pvt. educational institute, 2 for Govt. Hospital or any other number for any other institution");
                     n=sc.nextInt();
                     if (n==1)
                     {
                         t[i]=(787)*bt[i];
                     }
                     else if (n==2)
                     {
                         t[i]=(424)*bt[i];
                     }
                     else
                     {
                         t[i]=(605)*bt[i];
                     }
            }
            else if(c=="D")
            {
                     System.out.println("Enter 1 for Pvt. Hospital or any other number for all others");
                     n=sc.nextInt();
                     if(n==1)
                     {
                         t[i]=(1694)*bt[i];
                     }
                     else
                          t[i]=(80)*bt[i];
            }
            else
                     System.out.println("Wrong Choice");
              
            int sum=0;
            System.out.println("Customer/tperiod/tBill_Amount");
            for(i=0; i<5;i++)
            {
                n=i+1;
                sum+=t[i];
                System.out.println(n+"\t"+bp[i]+"\t"+t[i]);
                
            }
            System.out.println("\tTotal_Bill\t"+sum);
        }
    }
}
