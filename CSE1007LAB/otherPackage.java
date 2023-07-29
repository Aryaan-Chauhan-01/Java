package p2;
import p1.protection;
public class otherPackage
{
void method()
{
 protection p=new protection();
 System.out.println("Different package non-subclass\n"+p.n+"\t"+p.n_pri+"\t"+p.n_pro+"\t"+p.n_pub);
}
}
