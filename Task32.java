package by.jb29.mod1.les03;

/*
 * �������� ���������, ������� �� �������� ���� ������ ����������, �������� �� ����� �����-���� ����
�� ��� �������������.
 */

public class Task32 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 342;
		b = 345;
		c = 42;
		
		int sum1 = a + b;
		int sum2 = a + c;
		int sum3 = b + c;
		
		if(sum1 > 0) {
			System.out.println("����� �������������.");
		}else if(sum2 > 0) {
			System.out.println("����� �������������.");
		}else if(sum3 > 0) {
			System.out.println("����� �������������.");
		}else {
			System.out.println("����� ���� ����� ������������� ���� 0.");
		}

	}

}
