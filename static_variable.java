class static_variable
{
 public static void main(String args[])
 {
  student s= new student("JITISHA","CSE");
  s.show();
 }
}
class student 
{
 String name;
 String course;
 static String cllg = "MODY";
 student(String nm, String c)
 {
  name = nm;
  course= c;
 }
 void show()
 {
  System.out.println(name+" "+course+" "+cllg);
 }
}