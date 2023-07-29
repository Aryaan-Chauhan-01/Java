import java.io.*;
import java.util.Scanner;
public class readcsv
{
 public static void main(String[] args)throws Exception
 {
   Scanner sc=new Scanner(new File("D:\\CSE1007LAB\\FileLab.csv"));
   sc.useDelimiter(",");
   while(sc.hasNext())
   {
    System.out.print(sc.next());
   }
  sc.close();
 }
}
