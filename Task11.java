package by.jb29.mod1.les03;

//��������� ���������, ������� ��������� ������� ������ ������������ ������.


public class Task11 {

	public static void main(String[] args) {
		
		int a1, h1, a2, h2; //��������� � ������
		
		a1 = 6;
		h1 = 4;
	
		a2 = 6;
		h2 = 4;
		
		
		double s1 = (1.0 / 2) * a1 * h1;
		double s2 = (1.0 / 2) * a2 * h2;
		
		
		
		if(s1 < s2) {
			System.out.println("������� ������� ������������ ������.");
		}else if(s1 > s2) {
			System.out.println("������� ������� ������������ ������.");
		}else {
			System.out.println("������� ������������� �����.");
		}
		

	}

}
