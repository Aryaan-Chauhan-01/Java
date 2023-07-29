// rotate an array by a number k
/*

 array 1,2,3,4
 k=1
 4,1,2,3

*/

import java.io.*;
import java.util.Scanner;
class tcsp5
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int k=4;
        int f[];
        for(int i=0;i<k;i++)
        {
        int last=a[a.length-1];
        for(int j=a.length-1;j>0;j--)
        {
            a[j]=a[j-1];
        }
        a[0]=last;
        
        }
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
    

    }
}