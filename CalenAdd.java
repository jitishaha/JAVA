import java.util.*;
class CalenAdd
{
 public static void main(String arg[])
 {
  Calendar cal = Calendar.getInstance();
  cal.add(Calendar.DATE,-10);
  System.out.println("10 days to ago: "+cal.getTime());
  cal.add(Calendar.MONTH,6);
  System.out.println("6 months later: "+cal.getTime());
  cal.add(Calendar.YEAR,5);
  System.out.println("5 years later: "+cal.getTime());
 }
}