import java.io.*;
import java.util.*;
class da1
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n,d;
System.out.println("Enter the number");
n=sc.nextInt();
System.out.print(n+"\t");
while(n>1)
{
d=n%2;
if(d==0)
 {
n=n/2;
System.out.print(n+"\t");
 }
else
{
 n=3*n+1;
System.out.print(n+"\t");
}
}
}
}
