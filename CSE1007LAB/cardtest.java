import java.io.*;
import java.util.*;
class handscore
{

int i,ia,ib;
float fa,fb;
enum card{A,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,KING,QUEEN,JACK}
void handscore()
{
for(card i :card.values())
{
System.out.println(i.ordinal()+1);
}
}
}
class cardtest
{
 public static void main(String args[])
{
 Scanner x1=new Scanner(System.in);
handscore h=new handscore();
int i;
String[] c=new String[4];
for(i=0;i<4;i++)
{
System.out.println("Enter card"+(i+1));
c[i]=x1.next();
h.handscore();
}

}

}