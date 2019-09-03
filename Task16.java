package by.jb29.mod1.les03;

/*
 * На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или
в каком координатном угле).
 */


public class Task16 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 0;
		y = -10;
		
		if(x > 0 & y > 0) {
			
			System.out.println("Точка А лежит в I координатном угле.");
			
		}else if(x < 0 & y > 0) {
			
			System.out.println("Точка А лежит во II координатном угле.");
			
		}else if(x < 0 & y < 0) {
			
			System.out.println("Точка А лежит в III координатном угле.");
			
		}else if(x > 0 & y < 0) {
			
			System.out.println("Точка А лежит в IV координатном угле.");
			
		}else if(x != 0 & y == 0) {
			
			System.out.println("Точка А лежит на координатной оси X.");
			
		}else if(x == 0 & y != 0) {
			
			System.out.println("Точка А лежит на координатной оси Y.");
			
		}else {
			
			System.out.println("Точка лежит непонятно где!");
			
		}
		

	}

}
