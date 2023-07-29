import java.lang.Thread;
class threadEx8 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(this.getName()+" "+i);
try{
this.sleep(1000);
}
catch(Exception e){}

 }

}
}
class threadEx81 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(this.getName()+" Thread 81");
try{
this.sleep(1000);
}
catch(Exception e){}
}
}
}

class runthread implements Runnable
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println(" t4 runnable");
try{
Thread.sleep(1000);
}
catch(Exception e){}
}
}
}

class threadmain8
{
public static void main(String args[])
{
threadEx8 t1=new threadEx8();
t1.setName("t1");
t1.start();
try{
t1.join();}catch(Exception e){}
threadEx8 t2=new threadEx8();
t2.setName("t2");
t2.start();
try{
t2.join();}catch(Exception e){}
threadEx81 t3=new threadEx81();
t3.setName("t3");
t3.start();
try{
t3.join();}catch(Exception e){}

runthread rt=new runthread();
Thread t4=new Thread(rt,"t4");
t4.start();
}

}
