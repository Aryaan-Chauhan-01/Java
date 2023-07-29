//GCD of two numbers
import java.io.*;
class tcsp3
{
    public static void main(String args[])
    {
        int n1=45,n2=60;
        int d=1;
        for(int i=2;i<n1;i++)
        {
            if(n1%i==0 && n2%i==0 && i>d)
            {
                d=i;

            }
        }
        System.out.print(d);
    }
}