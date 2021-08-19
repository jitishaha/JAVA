import java.util.*;
class CalenMax
{
 public static void main(String arg[])
 {
  Calendar calendar = Calendar.getInstance();

  int max = calendar.getMaximum(Calendar.DAY_OF_MONTH);
  System.out.println("Maximum number of days in month:"+max);
 
  max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
  System.out.println("Maximum number of yeak in year:"+max);
 }
} 