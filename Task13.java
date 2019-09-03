package by.jb29.mod1.les03;

/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
ближе к началу координат.
*/


public class Task13 {

	public static void main(String[] args) {
		
		//точка А
		int x1;
		int y1;
		
		x1 = 4;
		y1 = 7;
		
		double c1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)); //расстояние до точки А
		
		//точка В
		int x2;
		int y2;
		
		x2 = -5;
		y2 = 6;
		
		double c2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2)); //расстояние до точки В
		
		
		if(c1 < c2) {
			System.out.println("Точка А находится ближе к началу координат.");
		}else {
			System.out.println("Точка В находится ближе к началу координат");
		}

	}

}
