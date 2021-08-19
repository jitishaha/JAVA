import java.util.*;
class CalenMin
{
 public static void main(String arg[])
 {
  Calendar calendar = Calendar.getInstance();

  int min = calendar.getMinimum(Calendar.DAY_OF_MONTH);
  System.out.println("Minimum number of days in month:"+min);
 
  min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
  System.out.println("Minimum number of yeak in year:"+min);
 }
} 