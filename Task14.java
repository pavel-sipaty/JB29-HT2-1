package by.jb29.mod1.les03;

/*
 * ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, ��
����� �� �� �������������
 */




public class Task14 {

	public static void main(String[] args) {
		
		int ugolA;
		int ugolB;
		int ugolC;

		ugolA = 60;
		ugolB = 30;
		ugolC = 90;
		
		boolean treug = (ugolA + ugolB + ugolC == 180);
		
		if(treug) {
			
			if(ugolA == 90 | ugolB == 90 | ugolC == 90) {
				System.out.println("��� ����������� � �� �������������.");
			}else {
				System.out.println("��� �����������, �� �� �� �������������.");
			}
		}else {
			System.out.println("��� �� �����������!");
		}

	}

}
