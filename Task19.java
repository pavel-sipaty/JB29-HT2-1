package by.jb29.mod1.les03;


//Подсчитать количество положительных среди чисел а, b, с

public class Task19 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		a = 23;
		b = 23;
		c = -44;
		
		
		if(a > 0 & b > 0 & c > 0) {
			
			System.out.println("Три положительных числа.");
			
		}else if(a <= 0 & b <= 0 & c <= 0) {
			
			System.out.println("Положительных чисел нет.");
			
		}else if(a > 0 & b > 0 & c <= 0) {
			
			System.out.println("Два положительных числа.");
			
		}else if(a > 0 & b <= 0 & c <= 0) {
			
			System.out.println("Одно положительное число.");
			
		}else if(a <= 0 & b <= 0 & c > 0) {
			
			System.out.println("Одно положительное число.");
			
		}else if(a <= 0 & b > 0 & c > 0) {
			
			System.out.println("Два положительных числа.");
			
		}else if(a <= 0 & b > 0 & c <= 0) {
			
			System.out.println("Одно положительное число.");
			
		}else if(a <= 0 & b > 0 & c > 0) {
			
			System.out.println("Два положительных числа.");
		}else {
			System.out.println("Это не числа?");
		}
		

	}

}
