package by.jb29.mod1.les03;


//��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b

public class Task08 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = -3;
		
		int kvadA = (int)Math.pow(a, 2);
		int kvadB = (int)Math.pow(b, 2);
		
		if(kvadA < kvadB) {
			
			System.out.println("���������� ������� �����: " + kvadA);
					
		} else {
			System.out.println("���������� ������� �����: " + kvadB);
		}
		

	}

}
