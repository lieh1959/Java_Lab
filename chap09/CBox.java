package app9_19;

import app9_19.CBox.CColor;

class CBox                // �~�����O
{
   private int length;     // CBox���O���󪺪�
   private int width;      // CBox���O���󪺼e
   private int height;     // CBox���O���󪺰�
   private CColor cr;      // CColor���O�������ܼ�cr�A�ΨӪ���C��

   public CBox(int l,int w,int h, String col)    // CBox�غc��
   {
      length=l;
      width=w;
      height=h;
      cr=new CColor(col);        // ��new�إ�CColor����
   }
   static class CColor               // �������O
   {
      private static String color;

      public CColor(String clr)     // CColor�غc��
      {
         color=clr;
      }
      public static void show_color()      // ����C��
      {
         System.out.println("color="+color);
      }
   }
   public void show()            // �~�����OCBox���������
   {
      System.out.println("length="+length);
      System.out.println("width="+width);
      System.out.println("height="+height);
      CBox.CColor.show_color();
   // System.out.println("color="+cr.color);
   }
}
