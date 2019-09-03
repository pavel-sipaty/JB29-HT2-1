package by.jb29.mod1.les03;


/*
 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным
большему из исходных, а если равны, то заменить числа нулями.
 */



public class Task17 {

	public static void main(String[] args) {
		
		int m;
		int n;
		
		m = 5;
		n = 5;
		
		if(m != n) {
			
			if(m > n) {
				int m1 = m;
				int n1 = m;
				System.out.println(m + ">" + n);
				System.out.println("m = " + m1);
				System.out.println("n = " + n1);
			} else {
				int m1 = n;
				int n1 = n;
				System.out.println(m + " < " + n);
				System.out.println("m = " + m1);
				System.out.println("n = " + n1);
			}
			
		}else {
			int m1 = 0;
			int n1 = 0;
			System.out.println(m + " = " + n);
			System.out.println("m = " + m1);
			System.out.println("n = " + n1);
		}
		
		

	}

}
