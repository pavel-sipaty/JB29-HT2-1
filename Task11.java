package by.jb29.mod1.les03;

//Составить программу, которая определит площадь какого треугольника больше.


public class Task11 {

	public static void main(String[] args) {
		
		int a1, h1, a2, h2; //основание и высота
		
		a1 = 6;
		h1 = 4;
	
		a2 = 6;
		h2 = 4;
		
		
		double s1 = (1.0 / 2) * a1 * h1;
		double s2 = (1.0 / 2) * a2 * h2;
		
		
		
		if(s1 < s2) {
			System.out.println("Площадь первого треугольника меньше.");
		}else if(s1 > s2) {
			System.out.println("Площадь второго треугольника меньше.");
		}else {
			System.out.println("Площади треугольников равны.");
		}
		

	}

}
