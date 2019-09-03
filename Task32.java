package by.jb29.mod1.les03;

/*
 * Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух
из них положительной.
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
			System.out.println("Сумма положительная.");
		}else if(sum2 > 0) {
			System.out.println("Сумма положительная.");
		}else if(sum3 > 0) {
			System.out.println("Сумма положительная.");
		}else {
			System.out.println("Сумма двух чисел отрицательная либо 0.");
		}

	}

}
