class CCal{
	int radius;
	int length;
	int width;
	int height;
	double pi = 3.1416;
	void Cal_area(int r) {              //�h��1
		radius = r;
		show_b();
	}
	void Cal_area(int l, int w, int h) {			//�h��2
		length = l;
		width = w;
		height = h;
		show_c();
	}
	void show_b() {
		System.out.println("�b�| = "+ radius);
		System.out.println("�y����n = "+ 4*pi*radius*radius*radius/3);}
	void show_c() {
		System.out.println("�� = "+length+" ,�e = "+width+" ,�� = "+height);
		System.out.println("�ߤ�������n = "+ 2*(length*width+length*height+width*height));		
	}
}
public class Class01 {
	public static void main(String args[]) {
		CCal ca = new CCal();
		ca.Cal_area(10);
		System.out.println("");
		ca.Cal_area(4, 5, 6);
		//ca.show_b();
		
		//ca.show_c();
	}
}