package by.jb29.mod1.les03;

/*
 * �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ��� ����������� (�� ����� ��� ���
� ����� ������������ ����).
 */


public class Task16 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 0;
		y = -10;
		
		if(x > 0 & y > 0) {
			
			System.out.println("����� � ����� � I ������������ ����.");
			
		}else if(x < 0 & y > 0) {
			
			System.out.println("����� � ����� �� II ������������ ����.");
			
		}else if(x < 0 & y < 0) {
			
			System.out.println("����� � ����� � III ������������ ����.");
			
		}else if(x > 0 & y < 0) {
			
			System.out.println("����� � ����� � IV ������������ ����.");
			
		}else if(x != 0 & y == 0) {
			
			System.out.println("����� � ����� �� ������������ ��� X.");
			
		}else if(x == 0 & y != 0) {
			
			System.out.println("����� � ����� �� ������������ ��� Y.");
			
		}else {
			
			System.out.println("����� ����� ��������� ���!");
			
		}
		

	}

}
