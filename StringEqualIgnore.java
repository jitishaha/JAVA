class StringEqualIgnore
{
 public static void main(String arg[])
 {
  String j1="jitisha";
  String j2="JITISHA"; 
  String j3="Bhakti";
  System.out.println("Compare String: "+j1.equalsIgnoreCase(j2));
  System.out.println("Compare String: "+j1.equalsIgnoreCase(j3));
 }
}