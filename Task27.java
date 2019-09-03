package by.jb29.mod1.les03;

//Найти max{min(a, b), min(c, d)}


public class Task27 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		
		a = 3451;
		b = 1345;
		c = 4313;
		d = 543;
		
		int minAB;
		int minCD;
		
		if(a < b) {
			minAB = a;
		}else {
			minAB = b;
		}

		if(c < d) {
			minCD = c;
		}else {
			minCD = d;
		}
		
		if (minAB > minCD) {
			System.out.println("Максимальное число из минимальных: " + minAB);
		}else {
			System.out.println("Максимальное число из минимальных: " + minCD);
		}
	}

}
