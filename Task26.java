package by.jb29.mod1.les03;

//�������� ��������� ���������� ����� �������� � �������� �� ���� �����.

public class Task26 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		int sum;
		
		a = 345;
		b = 340;
		c = 325;
		
		if(a > b & a > c & b < c) {
			sum = a + b;
			System.out.println("����������: " + a);
			System.out.println("����������: " + b);
			System.out.println("�����: " + sum);
			
		}else if(a > b & a > c & c < b) {
			sum = a + c;
			System.out.println("����������: " + a);
			System.out.println("����������: " + c);
			System.out.println("�����: " + sum);

		}else if(b > a & b > c & a < c) {
			sum = b + a;
			System.out.println("����������: " + b);
			System.out.println("����������: " + a);
			System.out.println("�����: " + sum);
			
		}else if(b > a & b > c & c < a) {
			sum = b + c;
			System.out.println("����������: " + b);
			System.out.println("����������: " + c);
			System.out.println("�����: " + sum);
			
		}else if(c > a & c > b & a < b) {
			sum = c + a;
			System.out.println("����������: " + c);
			System.out.println("����������: " + a);
			System.out.println("�����: " + sum);
			
		}else if(c > a & c > b & b < a) {
			sum = c + b;
			System.out.println("����������: " + c);
			System.out.println("����������: " + b);
			System.out.println("�����: " + sum);
			
		}else {
			System.out.println("����� ���� ����� ��� ������ ����������� � ������ �����������.");
		}

	}
}
