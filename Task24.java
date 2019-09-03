package by.jb29.mod1.les03;


/*
 * Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за
исходное данное количество лепестков n.
 */

public class Task24 {

	public static void main(String[] args) {
		
		int n;
		
		n = 7;
		
		if(n % 2 == 0) {
			System.out.println("Вас любят!");
		}else {
			System.out.println("Лучше сорвите другую ромашку.");
		}

	}

}
