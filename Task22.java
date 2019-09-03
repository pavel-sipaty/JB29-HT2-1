package by.jb29.mod1.les03;

/*
 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y -
меньшее.
 */


public class Task22 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 1;
		y = 5;
		
		
		
		if(x > y) {
			int x1 = x;
			int y1 = y;
			System.out.println("x = " + x1);
			System.out.println("y = " + y1);
		}else if(x < y) {
			int x1 = y;
			int y1 = x;
			System.out.println("x = " + x1);
			System.out.println("y = " + y1);
		}else {
			System.out.println(x + " = " + y);
		}

	}

}
