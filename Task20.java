package by.jb29.mod1.les03;

//����������, ��������� ����� ����� �, b, � �������� ����� k


public class Task20 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int k;
		
		a = 10;
		b = 5;
		c = 3;
		
		k = 5; //��������
		
		boolean ostA = (a % k == 0);
		boolean ostB = (b % k == 0);
		boolean ostC = (c % k == 0);
		
		if(ostA) {
			System.out.println(k + " �������� ��������� ����� " + a);
		}else {
			System.out.println("----------");
		}
		
		
		if(ostB) {
			System.out.println(k + " �������� ��������� ����� " + b);
		}else {
			System.out.println("----------");
		}

		
		if(ostC) {
			System.out.println(k + " �������� ��������� ����� " + c);
		}else {
			System.out.println("----------");
		}
	}

}
