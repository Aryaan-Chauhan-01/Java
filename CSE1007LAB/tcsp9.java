/*
print 1st n terms of the series 
6 28 66 120 190 276 ...
 22 38 54 70  86
   16 16 16 16
*/

import java.io.*;
import java.util.Scanner;
class tcsp9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,f=6,d=22;
        n=sc.nextInt();
        System.out.print(f+" ");
        for(int i=0;i<n-1;i++)
        {
            int diff=d+16*i;
            f=f+diff;
            System.out.print((f)+" ");
        }


    }
}