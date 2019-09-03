package by.jb29.mod1.les03;

//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х



public class Task07 {

	public static void main(String[] args) {
		
		int a, b, c, x;
		
		a = -100;
		b = 2;
		c = 3;
		x = 4;
		
		int rez = Math.abs(a * x * x + b * x + c);
		
		System.out.println("Модуль выражения равен " + rez);

	}

}
