package by.jb29.mod1.les03;

import java.util.Scanner;

/*
 * ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻.
� ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� ��������
��������!�.
 */



public class Task21 {

	public static void main(String[] args) {
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �.");
		System.out.print(">>> ");
		
		Scanner kto = new Scanner(System.in);
		
		String str;
		char ch;
		//char d = ch1;
		
		//char m ;
		
		str = kto.next();
		
		ch = str.charAt(0);
		
		
		if (ch == '�') {
			System.out.println("��� �������� ��������!");
		}else if(ch == '�') {
			System.out.println("��� �������� �������!");
		}else {
			System.out.println("�� ����� ���-�� �� ��: " + ch);
		}
		

	}

}
