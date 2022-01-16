import java.lang.*;
abstract class CShape                          //��H���O
{
  public int number;                   //���
  public int totalAngle;       //�����M,������totalAangle=(number-2)*180
  public abstract void angle();        //��H��k
  @Override public String toString()   //(b)
  {
    return "��" + number + "��ΨC�@����" + (totalAngle/number) + "��";
  }
}

class CTriangle extends CShape		//���T����
{
 @Override public void angle()  //(a) 
 {
     	number=3;
     	totalAngle=(number-2)*180;     
 }
 
}
class CRect extends CShape		//���|���
{
  @Override public void angle() //(a)
  {
     	number=4;
     	totalAngle=(number-2)*180;
  }  
}
class CPentagon extends CShape		//�������
{
  @Override public void angle() //(a)
  {
     	number=5;
     	totalAngle=(number-2)*180;
  }
}
//===========================================================
public class J04         //�D���O
{
    public static void main(String args[])                
    {
         CShape objArr[] = new CShape[3];
         objArr[0]=new CTriangle();      
         objArr[1]=new CRect();                        
         objArr[2]=new CPentagon();                   
         for(int i=0;i<objArr.length;i++)		//(c)
            objArr[i].angle();           
         for(int i=0;i<objArr.length;i++)		//(c)
            System.out.println(objArr[i].toString());
         
    }    
}    

