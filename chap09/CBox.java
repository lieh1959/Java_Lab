package app9_19;

import app9_19.CBox.CColor;

class CBox                // 外部類別
{
   private int length;     // CBox類別物件的長
   private int width;      // CBox類別物件的寬
   private int height;     // CBox類別物件的高
   private CColor cr;      // CColor類別的物件變數cr，用來表示顏色

   public CBox(int l,int w,int h, String col)    // CBox建構元
   {
      length=l;
      width=w;
      height=h;
      cr=new CColor(col);        // 用new建立CColor物件
   }
   static class CColor               // 內部類別
   {
      private static String color;

      public CColor(String clr)     // CColor建構元
      {
         color=clr;
      }
      public static void show_color()      // 顯示顏色
      {
         System.out.println("color="+color);
      }
   }
   public void show()            // 外部類別CBox的成員函數
   {
      System.out.println("length="+length);
      System.out.println("width="+width);
      System.out.println("height="+height);
      CBox.CColor.show_color();
   // System.out.println("color="+cr.color);
   }
}
