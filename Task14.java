package by.jb29.mod1.les03;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то
будет ли он прямоугольным
 */




public class Task14 {

	public static void main(String[] args) {
		
		int ugolA;
		int ugolB;
		int ugolC;

		ugolA = 60;
		ugolB = 30;
		ugolC = 90;
		
		boolean treug = (ugolA + ugolB + ugolC == 180);
		
		if(treug) {
			
			if(ugolA == 90 | ugolB == 90 | ugolC == 90) {
				System.out.println("Это треугольник и он прямоугольный.");
			}else {
				System.out.println("Это треугольник, но он не прямоугольный.");
			}
		}else {
			System.out.println("Это не треугольник!");
		}

	}

}
