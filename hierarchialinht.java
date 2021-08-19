class corona
{
 void virus()
 {
  System.out.println("China's secret bio weapon");
 }
}
class china extends corona
{
 void wuhan()
 {
  System.out.println("wuhan city is isolated");
 }
}
class italy extends corona 
{
 void venice()
 {
  System.out.println("venice lockdown");
 }
}
class hierarchialinht
{
 public static void main(String args[])
 {
  italy f = new italy();
  f.venice();
  f.virus();
 }
}