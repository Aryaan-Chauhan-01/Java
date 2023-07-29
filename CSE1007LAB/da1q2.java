import java.io.*;
import java.util.*;
class da1q2
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
double n,s,sl,tanh,p,ng;
System.out.println("Enter the number");
n=sc.nextDouble();
p=Math.exp(n);
ng=Math.exp(-n);
s=1/(1+ng);
tanh=(p-ng)/(p+ng);
sl=n*(1+ng);
System.out.println("Sigmoid="+s+"\tHyperbolic tangent="+tanh+"\tSigmoid linear unit="+sl);
}
}
