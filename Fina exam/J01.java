import java.io.*;

//�w�q���Z�q�L��IPass����
interface IPass {
int s1 = 80;  // �U��z��з�
int s2 = 85;  // ���Ǫ��̧C���Z
void Pass();
}

//�w�qCCollage���O��@IPass����
class CCollage implements IPass {
int score1,score2,score3;
String title = "�Ǵ����Z,";
String passOK;
double avg;

public void Pass() {
  avg=(score1+score2+score3)/3. ;
	
 if (score1 >= s1){
 	if(score2 >=s1){
 		if(score3 >=s1){
 			if(avg >= s2) passOK = "���߱z!!�F���Ǫ��з�";
 			
 			else passOK = "���F���Ǫ��з�";
 		}else passOK = "���F���Ǫ��з�";
 	}else passOK = "���F���Ǫ��з�";
 }else passOK = "���F���Ǫ��з�";  
}   

}
/**************************************************************/
public class J01 {
  public static void main(String[] args) throws IOException {
    int chi_score01=82, eng_score01=83,math_score01=81;
    int chi_score02=81, eng_score02=88,math_score02=95;
	  //  �Ĥ@��ǥͦ��Z
    System.out.println("�Ĥ@��ǥͦ��Z");
	System.out.println("��妨�Z�G"+chi_score01);
    System.out.println("�^�妨�Z�G"+eng_score01);
    System.out.println("�ƾǦ��Z�G"+math_score01);
   
    CCollage pass1 = new CCollage();
    pass1.score1 = chi_score01;
    pass1.score2 = eng_score01;
    pass1.score3 = math_score01;
    pass1.Pass();
    System.out.print(pass1.title);
    System.out.println(pass1.avg);
    System.out.println(pass1.passOK); 
    System.out.println("--------------------------------");
    //  �ĤG��ǥͦ��Z
    System.out.println("�ĤG��ǥͦ��Z");
	System.out.println("��妨�Z�G"+chi_score02);
    System.out.println("�^�妨�Z�G"+eng_score02);
    System.out.println("�ƾǦ��Z�G"+math_score02);
    CCollage pass2 = new CCollage();
    pass2.score1 = chi_score02;
    pass2.score2 = eng_score02;
    pass2.score3 = math_score02;
    pass2.Pass();
    System.out.print(pass2.title);
    System.out.println(pass2.avg);
    System.out.println(pass2.passOK); 
    System.out.println("--------------------------------");
       
    
  }
}




