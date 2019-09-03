package by.jb29.mod1.les03;

//Вычислить значение функции

public class Task39 {

	public static void main(String[] args) {
		
		int x;
		double f;
		
		x = 8;
		
		if(x >= 8) {
			f = -1 * Math.pow(x, 2) + x - 9;
		}else {
			f = 1 / (Math.pow(x, 4) - 6);
		}
		
		System.out.println(f);

	}

}
