/***********�ĤT�D*******************/
class Data
{
	
	private String name;	
	private Test score;   // ���O���A
	private  Test data ;
	 public Data(String na , int en, int m ) {				//�~���غc��
		 this.name=na;
		 data=new Test(en, m);
	 }
	 /***********�ϥα_�����O*******************/
	 class Test 				//(1)�������O
	 {
		 public Test() {
		 }
		 
		 public Test (int eng,int m)    // (2) �غc��
			{
				english=eng;
				math=m;
			}
		int english;			//(1) ����
		int math;
		double avg()				//(3) ��k1
		{
			return (english+math)/2;
			
		}
	
	 }

	void show ()				//(4) ��k2
	{
		Test t=new Test();
		System.out.print("name:"+name);
		System.out.println(" english="+t.english+" math="+t.math);
		
	}

}

public class Class03 {

	public static void main(String[] args)
	{
		Data[] a;			//(5)����}�C a
		a=new Data[2];
		
		a[0]=new Data("Annie",85,92);  
		a[1]=new Data("Brian",77,56);
				
		  a[0].show();
		  a[1].show();
	}

}


