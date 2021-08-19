class singleinht
{
 public static void main(String args[])
 {
  Student s = new Student();
  s.study();
  s.sub();
 }
}
class Subject1
{
 void study()
  {
   System.out.println("Study");
  }
}
class Student extends Subject1
{
 void sub()
  {
   System.out.println("English");
  }
}
