package by.jb29.mod1.les03;


/*
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в
четвертую степень — отрицательные.
 */


public class Task12 {

	public static void main(String[] args) {
		
		double a, b, c;
		
		a = 3;
		b = -3;
		c = 4;
		
		if(a > 0) {
			double chetA = Math.pow(a, 2);
			System.out.println(chetA);
		}else {
			double neChetA = Math.pow(a, 4);
			System.out.println(neChetA);
		}

		
		if(b > 0) {
			double chetB = Math.pow(b, 2);
			System.out.println(chetB);
		}else {
			double neChetB = Math.pow(b, 4);
			System.out.println(neChetB);
		}
		
		
		if(c > 0) {
			double chetC = Math.pow(c, 2);
			System.out.println(chetC);
		}else {
			double neChetC = Math.pow(c, 4);
			System.out.println(neChetC);
		}
		
		
		
		
	}

}
