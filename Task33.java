package by.jb29.mod1.les03;

import java.util.Scanner;

/*
 * �������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������� � ���������
���������� � ���� ������. ������ � ���� ����� ������ ����� �������, �������� �� ��� ������ �� �������
�������. ��� ����� ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � ��������
������ ��� �, �; 9455, 8997 � �������� ������ ���� �.
 */


public class Task33 {

	public static void main(String[] args) {
		
		int p1 = 9583;
		int p2 = 1747;
		int p3 = 3331;
		int p4 = 7922;
		int p5 = 9455;
		int p6 = 8997;
		
		System.out.println("������� ��� �������:");
		System.out.print(">>> ");
				
		Scanner vvod = new Scanner(System.in);
		int p = vvod.nextInt();
		
		
		if(p == p1 | p == p2) {
			System.out.println("������ ������ � ������ ����: �, �, �.");
		}else if(p == p3 | p == p4) {
			System.out.println("������ ������ � ������ ����: �, �.");
		}else if(p == p5 | p == p6) {
			System.out.println("������ ������ � ������ ����: �.");
		}else {
			System.out.println("�� ����� �������� ������.");
		}
		
	}

}
