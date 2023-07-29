/*
start at any rand number from fixed number though distributed sequentially and find the fixed position

example 4 people
 1  2  3  4

 starts at 3 , then 4 has the 6th piece 

 3 4 1 2 3 4


*/
import java.io.*;
import java.util.Scanner;
class tcsp14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        System.out.println("Number of observation");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("The starting position");
        s=sc.nextInt();
        int i=s;
        int c=0;
        while(i<=n)
        {
            a[c]=i;
            i++;
            c++;

        }
        int j=1;
        while(j<s)
        {
            a[c]=j;
            c++;
            j++;
        }
        System.out.print("Which chocolate is awful");
        int aw=sc.nextInt();
        int r=aw%n;
        int p=r-1;
        System.out.println("The person is "+a[p]);

    }
}