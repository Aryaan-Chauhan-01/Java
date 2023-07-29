/*
first moves 10 ,2nd turns moves 20 , 3rdturns 30,4th 40 like jalebi
            (10,0)            (10,20) (-20,20)  (-20,-20)...
*/

import java.io.*;
import java.util.Scanner;
class tcsp12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int x=0,y=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%4==1)
             x+=i*10;
            else if(i%4==2)
             y+=i*10;
            else if(i%4==3)
             x-=i*10;
            else 
             y-=i*10;
        }
        System.out.println("X co-ordinate:"+x+" Y co-ordinate:"+y);
    }
}
