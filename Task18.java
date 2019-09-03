package by.jb29.mod1.les03;

/*
 * Подсчитать количество отрицательных среди чисел а, b, с
 */



public class Task18 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 23;
		b = 23;
		c = -44;
		
		
		if(a < 0 & b < 0 & c < 0) {
			
			System.out.println("Три отрицательных числа.");
			
		}else if(a >= 0 & b >= 0 & c >= 0) {
			
			System.out.println("Отрицательных чисел нет.");
			
		}else if(a < 0 & b < 0 & c >= 0) {
			
			System.out.println("Два отрицательных числа.");
			
		}else if(a < 0 & b >= 0 & c >= 0) {
			
			System.out.println("Одно отрицательное число.");
			
		}else if(a >= 0 & b >= 0 & c < 0) {
			
			System.out.println("Одно отрицательное число.");
			
		}else if(a >= 0 & b < 0 & c < 0) {
			
			System.out.println("Два отрицательных числа.");
			
		}else if(a >= 0 & b < 0 & c >= 0) {
			
			System.out.println("Одно отрицательное число.");
			
		}else if(a >= 0 & b < 0 & c < 0) {
			
			System.out.println("Два отрицательных числа.");
		}else {
			System.out.println("Это не числа?");
		}


	}
}