/*
  given a input string get 3 substrings where each sub string is a palindrome
  example input ababbcb
         output a bab bcb
*/

import java.io.*;
import java.util.Scanner;
class tcsp11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int l=s.length();
        for(int i=l-1;i>l/2;i--)
        {
            for(int j=0;j<l/2;j++)
            {
            String s1=s.substring(j,i);
            String s2="";
            for(int k=s1.length()-1;k>=0;k--)
            {
                char c=s1.charAt(k);
                s2=s2+c;
            }
            if(s2.equals(s1))
            {
                System.out.println(s1+" ");
            }
            }

        }
    }
}