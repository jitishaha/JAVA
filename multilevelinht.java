class virus
{
 void stay_home()
 {
  System.out.println("Be safe");
 }
}
class corona extends virus
{
 void wash_hands()
 {
  System.out.println("Be clean");
 }
}
class china extends corona
{
 void spread()
 {
  System.out.println("World is in danger");
 }
}
class multilevelinht
{
 public static void main(String args[])
 {
  china f = new china();
  f.spread();
  f.wash_hands();
  f.stay_home();
 }
}
