package by.jb29.mod1.les03;

//Вычислить значение функции


public class Task40 {

	public static void main(String[] args) {
		
		double x;
		double f;
		
		x = 5;
		
		if(x <= 13) {
			f = -1 * Math.pow(x, 3) + 9;
		}else {
			f = -1 * (3 / (x + 1));
		}
		System.out.printf("%.2f", f);

	}

}
