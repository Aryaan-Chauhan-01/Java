/*
using directions find whether the person returns to same place

*/
import java.io.*;
import java.util.Scanner;
class tcsp13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st;
        st=sc.nextLine();
        int n=0,e=0,w=0,s=0;
        for(int i=0;i<st.length();i++)
        {
            char c=st.charAt(i);
            if(c=='N')
             n++;
            else if(c=='S')
             s++;
            else if(c=='E')
             e++;
            else 
             w++;
        }
        if((n==s) && (e==w))
         System.out.println("Returned back to same place");
        else 
         System.out.println("Didn't return to the same place");

    }
}