//given a string, write a function to generate all possible permutations of the characters in the string
/* eg in:abc
    out: abc,acb,bac,bca,cab,cba

*/
import java.io.*;
class tcsp7
{
    public static void main(String args[])
    {
        String s="abc";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            String t="";
            char f=s.charAt(i);
            t=t+f;
            for(int j=0;j<l;j++)
            {
                String t1="";
                t1=t1+t;
                char sec=s.charAt(j);
                
                if(sec!=f)
                {
                    t1=t1+sec;
                }
                for(int k=0;k<l;k++)
                {
                    String t2="";
                    t2=t2+t1;
                    char th=s.charAt(k);
                    if(th!=f && th!=sec)
                     {t2=t2+th;
                        }
                    else{
                        
                    }
                    if(t2.length()>2){
                     System.out.println(t2+" ");
                    }

                }
            }
           
        }
    }
}