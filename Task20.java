package by.jb29.mod1.les03;

//Определить, делителем каких чисел а, b, с является число k


public class Task20 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int k;
		
		a = 10;
		b = 5;
		c = 3;
		
		k = 5; //делитель
		
		boolean ostA = (a % k == 0);
		boolean ostB = (b % k == 0);
		boolean ostC = (c % k == 0);
		
		if(ostA) {
			System.out.println(k + " является делителем числа " + a);
		}else {
			System.out.println("----------");
		}
		
		
		if(ostB) {
			System.out.println(k + " является делителем числа " + b);
		}else {
			System.out.println("----------");
		}

		
		if(ostC) {
			System.out.println(k + " является делителем числа " + c);
		}else {
			System.out.println("----------");
		}
	}

}
