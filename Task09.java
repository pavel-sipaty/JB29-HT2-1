package by.jb29.mod1.les03;

//Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним


public class Task09 {

	public static void main(String[] args) {
		
		int a, b, c;
		a = 1;
		b = 1;
		c = 1;
		
		if(a == b && b == c) {
			System.out.println("Треугольник равносторонний!");
			
		} else {
			System.out.println("Треугольник неравносторонний! Укажи одинаковые стороны.");
		}

	}

}
