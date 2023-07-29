import java.io.*;
class tcsp1
{
 public static void main(String args[])
{
 int a[]={-2,1,-3,4,-1,2,1,-5,4};
 int max=a[0];
 int l=9;
 for(int i=0;i<l;i++){
    for(int j=0;j<l;j=j+i)
    {
        int t=0;
        for(int k=0;k<i;k++)
        {
            t+=a[k];
        }
        if(t>max){
            max=t;
        }

    }
 }
}
}