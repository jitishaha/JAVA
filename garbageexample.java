import java.awt.Window;
public class garbageexample
{
  public static void main(String[] args)
  {
   for(int z=0; z<50;z++)
   {
    System.out.println("before garbage collection="+ Window.getWindows().length);
    System.gc();
    System.out.println("after garbage collection= "+Window.getWindows().length);
   }
  }
}
