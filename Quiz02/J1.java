
import java.util.*;
public class J1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s1,s2;
		System.out.print("�п�J�K�X:");
		s1=sc.nextInt();
		int count=0;
		for(;;)
		{
			System.out.print("�ЦA����J�K�X:");
			s2=sc.nextInt();
			if(s1==s2)
				break;
			else
				count++;
			if(count==3)
				throw new RuntimeException("��J�T�����~�I�{������I");
			else
				System.out.println("�P�Ĥ@����J�����P!");
		}
		System.out.println("�K�X���T");
	}

}
