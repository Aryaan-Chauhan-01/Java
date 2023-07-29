//Construct hour glass with input where 0 is not considered while rest are considerd and find the sum of max hour glass
/* Ex of hour glass         
***
 *
***
ex
111000
010000
111000
002440
000200
001240

output 19

*/
import java.io.*;
class tcsp4
{
    public static void main(String args[])
    {
        int max=0;
        int a[6][6]={{1,1,1,0,0,0},
                     {0,1,0,0,0,0},
                     {1,1,1,0,0,0},
                     {0,0,2,4,4,0},
                     {0,0,0,2,0,0},
                     {0,0,1,2,4,0}};

        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                int t=0;
                if( a[i][j]!=0 && a[i][j+1]!=0 && a[i][j+2]!=0 && a[i+1][j+1]!=0 && a[i+2][j]!=0 && a[i+2][j+1]!=0 && a[i+2][j+2]!=0)
                {
                   t=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                }
                if(t>max)
                {
                    max=t;
                }
            }
        }
        System.out.Println(max);

    }
}