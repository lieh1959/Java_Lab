//********Ӌ�����؃r��
class area{
	int price=3000;
	double c_area(double s){		//���d1
		return (price*s*s);
	}
	
	double c_area(double l, double w) {		//���d2
		return (price*l*w);
	}
	
}



public class J04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area a= new area();
		double side=5.1;
		System.out.println("����߅�L="+side);
		System.out.println("������e�r��="+a.c_area(side));
		//----------------------------------
		double length=5.1, width=7.2;
		
		System.out.println("�L="+length+"��="+width);
		System.out.println("������e�r��="+a.c_area(length,width));
		
	}