import java.io.*;
import java.util.*;
class arraybook
{
 public static void main(String args[])
{
Scanner x1=new Scanner(System.in);
int a[]=new int[40];
int n,s,i,j;
System.out.print("Enter the number of seats needed to be booked:\t");
n=x1.nextInt();
System.out.println("There are total 40 seats numbering from 1 to 40 in the bus");
for(i=1;i<=n;i++)
{
 System.out.println("Enter seat choice for option "+i);
 s=x1.nextInt();
 s=s-1;
 if(s>=0 && s<40 && a[s]!=1)
{
 a[s]=1;
s=s+1;
System.out.println("Seat number"+s+"booked");
}
else
{
System.out.println("Seat number is not available");
break;
}
}
}
}