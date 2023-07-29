package p1;
public class samePackage
{
 samePackage()
 {
  protection p=new protection();
  System.out.println("Same package non-subclass\n"+p.n+"\t"+p.n_pri+"\t"+p.n_pro+"\t"+p.n_pub);
 }
}
