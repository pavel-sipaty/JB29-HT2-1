package by.jb29.mod1.les03;

/*
 * ���������� ���������� ������������� ����� ����� �, b, �
 */



public class Task18 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 23;
		b = 23;
		c = -44;
		
		
		if(a < 0 & b < 0 & c < 0) {
			
			System.out.println("��� ������������� �����.");
			
		}else if(a >= 0 & b >= 0 & c >= 0) {
			
			System.out.println("������������� ����� ���.");
			
		}else if(a < 0 & b < 0 & c >= 0) {
			
			System.out.println("��� ������������� �����.");
			
		}else if(a < 0 & b >= 0 & c >= 0) {
			
			System.out.println("���� ������������� �����.");
			
		}else if(a >= 0 & b >= 0 & c < 0) {
			
			System.out.println("���� ������������� �����.");
			
		}else if(a >= 0 & b < 0 & c < 0) {
			
			System.out.println("��� ������������� �����.");
			
		}else if(a >= 0 & b < 0 & c >= 0) {
			
			System.out.println("���� ������������� �����.");
			
		}else if(a >= 0 & b < 0 & c < 0) {
			
			System.out.println("��� ������������� �����.");
		}else {
			System.out.println("��� �� �����?");
		}


	}
}