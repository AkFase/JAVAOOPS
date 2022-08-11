public class Compound
{
  public static void main(String[] a)
{
  float p=Float.parseFloat(a[0]);
  float r=Float.parseFloat(a[1]);
  float n=Float.parseFloat(a[2]);
  double ci;
//p,r,ci,n,a
double q=Math.pow(1+r/100,n);
ci=p*q-p;
 System.out.println("compound interest="+ci);
  }}