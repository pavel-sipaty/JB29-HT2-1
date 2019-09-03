package by.jb29.mod1.les03;

/*
 * Найти max{min(a, b), min(c, d)}.
 */


public class Task31 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = 4;
		b = 3;
		
		int s = a * b;
		
		int x;
		int y;
		int z;
		
		x = 3;
		y = 3;
		z = 5;
		
		int s1 = x * y;
		int s2 = x * z;
		int s3 = y * z;
		
		if(s1 < s) {
			System.out.println("Кирпич проходит!");
		}else if(s2 < s) {
			System.out.println("Кирпич проходит!");
		}else if (s3 < s) {
			System.out.println("Кирпич проходит!");
		}else {
			System.out.println("Кирпич не проходит!");
		}

	}

}
