/*
take user input and find if it is a key word
*/

import java.io.*;
import java.util.Scanner;

class tcsp8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]={"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
        String s;
        s=sc.nextLine();
        int f=0;
        for(int i=0;i<a.length;i++)
        {
            if(s.equals(a[i]))
            {
                f=1;
                System.out.println("It is a keyword");
            }

        }
        if(f==0)
        {
            System.out.println("Its not a keyword");
        }

    }
}