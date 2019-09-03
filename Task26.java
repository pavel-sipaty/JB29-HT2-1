package by.jb29.mod1.les03;

//Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		int sum;
		
		a = 345;
		b = 340;
		c = 325;
		
		if(a > b & a > c & b < c) {
			sum = a + b;
			System.out.println("Наибольшее: " + a);
			System.out.println("Наименьшее: " + b);
			System.out.println("Сумма: " + sum);
			
		}else if(a > b & a > c & c < b) {
			sum = a + c;
			System.out.println("Наибольшее: " + a);
			System.out.println("Наименьшее: " + c);
			System.out.println("Сумма: " + sum);

		}else if(b > a & b > c & a < c) {
			sum = b + a;
			System.out.println("Наибольшее: " + b);
			System.out.println("Наименьшее: " + a);
			System.out.println("Сумма: " + sum);
			
		}else if(b > a & b > c & c < a) {
			sum = b + c;
			System.out.println("Наибольшее: " + b);
			System.out.println("Наименьшее: " + c);
			System.out.println("Сумма: " + sum);
			
		}else if(c > a & c > b & a < b) {
			sum = c + a;
			System.out.println("Наибольшее: " + c);
			System.out.println("Наименьшее: " + a);
			System.out.println("Сумма: " + sum);
			
		}else if(c > a & c > b & b < a) {
			sum = c + b;
			System.out.println("Наибольшее: " + c);
			System.out.println("Наименьшее: " + b);
			System.out.println("Сумма: " + sum);
			
		}else {
			System.out.println("Среди трех чисел нет одного наименьшего и одного наибольшего.");
		}

	}
}
