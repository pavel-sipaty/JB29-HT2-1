package by.jb29.mod1.les03;

/*
 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной
их суммы, а большее — их удвоенным произведением.
 */



public class Task15 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		x = 535.2;
		y = 277.23;
		
		if(x < y) {
			
			System.out.println(x + " < " + y);
			double x1 = (x + y) / 2;
			double y1 = 2 * x * y;
			x = x1;
			y = y1;
			System.out.println("новый х = " + x);
			System.out.println("новый y = " + y);
			
		}else {
			
			System.out.println(x + " > " + y);
			double x1 = 2 * x * y;
			double y1 = (x + y) / 2;
			x = x1;
			y = y1;
			System.out.println("новый х = " + x);
			System.out.println("новый y = " + y);
		}

	}

}
