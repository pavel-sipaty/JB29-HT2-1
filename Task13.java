package by.jb29.mod1.les03;

/*���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� �� ����� ���������
����� � ������ ���������.
*/


public class Task13 {

	public static void main(String[] args) {
		
		//����� �
		int x1;
		int y1;
		
		x1 = 4;
		y1 = 7;
		
		double c1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)); //���������� �� ����� �
		
		//����� �
		int x2;
		int y2;
		
		x2 = -5;
		y2 = 6;
		
		double c2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)); //���������� �� ����� �
		
		
		if(c1 < c2) {
			System.out.println("����� � ��������� ����� � ������ ���������.");
		}else {
			System.out.println("����� � ��������� ����� � ������ ���������");
		}

	}

}
