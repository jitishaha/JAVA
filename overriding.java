class vehicle
{
 void run()
 {
  System.out.println("vehicle is running");
 }
}
class Bike2 extends vehicle
{
 void run()
 {
  System.out.println("Bike is running safely");
 }
}
class overriding
{
 public static void main(String args[])
 {
  Bike2 obj= new Bike2();
  obj.run();
 }
}