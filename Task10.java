package by.jb29.mod1.les03;

//Составить программу, которая определит площадь какого круга меньше.


public class Task10 {

	public static void main(String[] args) {
		
		int r1 = 3;
		double r2 = 2.9;
		
		double s1 = Math.PI * Math.pow(r1, 2);
		double s2 = Math.PI * Math.pow(r2, 2);
		
		if(s1 < s2) {
			System.out.println("Площадь первого круга меньше");
		} else {
			System.out.println("Площадь второго круга меньше");
		}

	}

}
