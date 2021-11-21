
class Personel {
	String name; // �m�W
	int bornIn; // �X�ͦ~
	
	public Personel(String name,int bornIn) {
		this.name = name;
		this.bornIn = bornIn;
	}
	void show() {
		
	}

}

class Student extends Personel {
	String id; // �Ǹ��A����Ʀr
	int grade; // �~�šA1~6
	String c1,c2;  //�׽Ҭ��1, 2
	
	public Student(String name,int bornIn,String id,int grade, String c1,String c2) {
		super(name,bornIn);
		this.id = id;
		this.grade = grade;
		this.c1=c1;
		this.c2=c2;
	}
	void show() {			// override
		System.out.println("name:"+this.name);
		System.out.println("Date of Born:"+this.bornIn);
		System.out.println("Id:"+ this.id);
		System.out.println("grade:"+this.grade);
		System.out.println("course1:"+this.c1);
		System.out.println("course2:"+this.c2);
	}

}

class Teacher extends Personel {
	String course; // �б¬�ءA���B�^��B�ƾ�
	public Teacher(String name,int bornIn,String course) {
		super(name,bornIn);
		this.course = course;
	}
	void show() {				//override
		System.out.println("name:"+this.name);
		System.out.println("Date of Born:"+this.bornIn);
		System.out.println("Course:"+this.course);

	}
	
}

public class J01 {
	public static void main(String[] argv) {
		int i;
		Personel[] persons = new Personel[4];
			
		persons[0]=new Student("�i�T",88,"940001",1, "���","�^��");
		persons[1]=new Student("����",87,"930001",2,"�ƾ�","�^��");
		persons[2]=new Teacher("�i�E",60,"�^��");
		persons[3]=new Teacher("���Q",62,"���");
		
		for (i=0;i<persons.length;i++) {
			persons[i].show();
			System.out.println("----------------------");
		}
		
	}
}
