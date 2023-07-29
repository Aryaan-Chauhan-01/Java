/*
 find the difference of sun of the two diagonals of a matrix

 1  2  3  4
 5  6  7  8
 9 10 11 12
13 14 15 16

1st dia=34
2nd dia=34
 diff=0

*/

import java.io.*;
import java.util.Scanner;
class tcsp10
{
    public static void main(String args[])
    {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum1=0;
        int sum2=0;
        int d;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
              System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)
        {
            sum1+=a[i][i];
            sum2+=a[i][3-i];
        }
        if(sum1>sum2)
        {
            System.out.print(sum1-sum2);
        }
        else{
            System.out.print(sum2-sum1);
        }
    }
}