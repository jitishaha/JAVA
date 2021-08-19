import java.util.*;
class CalenGet
{
 public static void main(String arg[])
 {
  Calendar cal = Calendar.getInstance();
  System.out.println("Current Calendar's year:"+cal.get(Calendar.YEAR));
  System.out.println("Current Calendar's Day:"+cal.get(Calendar.DATE));
  System.out.println("Current Minute: "+cal.get(Calendar.MINUTE));
  System.out.println("Current Second: "+cal.get(Calendar.SECOND));
 }
}