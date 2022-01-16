
class OutException extends Exception
{ }
class InException extends Exception
{ }
class CenterException extends Exception
{ }

public class J02
{
   public static void main(String args[])
   {  
      double radius=10.0;
      double x1=7.5;
      double y1=6.8;
      double x2=0.2;
      double y2=15.5;
      double dist=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
      
      try
      {
         if(x1==x2 && y1==y2)
            throw new CenterException();
         else if(dist<=radius)
            throw new InException();
         else if(dist>radius)
            throw new OutException();         
      }
      catch(CenterException e)
      {
         System.out.print("("+x1+","+y1+")");
         System.out.print("�b�b�|"+radius);
         System.out.println(",���("+x2+","+y2+")����ߤW");  
      }      
      catch(OutException e)
      {
         System.out.print("("+x1+","+y1+")");
         System.out.print("���b�b�|"+radius);
         System.out.println(",���("+x2+","+y2+")���ꤺ");  
      }      
      catch(InException e)
      {
         System.out.print("("+x1+","+y1+")");
         System.out.print("�b�b�|"+radius);
         System.out.println(",���("+x2+","+y2+")���ꤺ");
      }
   }
}  

/* output--------------------------------
(5.3,6.8)�b�b�|10.0,���(0.2,9.5)���ꤺ
---------------------------------------*/ 