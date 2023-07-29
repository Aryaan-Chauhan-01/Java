import java.io.*;
class twodarray
{
 public static void main(String args[])
{
int tda[][]= new int[4][];
tda[0]=new int[1];
tda[1]=new int[2];
tda[2]=new int[3];
tda[3]=new int[4];

int i,j,k=0;
for(i=0;i<4;i++)
{
for(j=0;j<i+1;j++)
{
tda[i][j]=k;
k++;
}
for(i=0;i<4;i++)
{
for(j=0;j<i+1;j++)
{
 System.out.print(tda[i][j]+" ");
}
System.out.println();
}
}
}
}