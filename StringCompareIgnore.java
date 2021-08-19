class StringCompareIgnore
{
 public static void main(String arg[])
 {
  String s1="Java";
  String s2="JAVA";
  int i;
  i=s1.compareToIgnoreCase(s2);
  if(i==0)
  {
   System.out.println("Strings are same");
  }
  else
  {
   System.out.println("Strings are not same");
  }
 } 
}