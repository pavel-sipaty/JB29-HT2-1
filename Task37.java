package by.jb29.mod1.les03;


//Вычислить значение функции

public class Task37 {

	public static void main(String[] args) {
		
		int x;
		x= 4;
		
		double f;
		
		if(x >= 3) {
			
			f = -1 * Math.pow(x, 2) + 3 * x + 9;
			System.out.printf("F(x) = %.1f", f);
			
		}else {
			
			f = 1.0 / (Math.pow(x, 3) - 6);
			System.out.printf("F(x) = %.5f", f);
		}

	}

}
