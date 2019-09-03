package by.jb29.mod1.les03;

import java.util.Scanner;

/*
 * Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной
информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени
доступа. Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
модули баз В, С; 9455, 8997 — доступен модуль базы С.
 */


public class Task33 {

	public static void main(String[] args) {
		
		int p1 = 9583;
		int p2 = 1747;
		int p3 = 3331;
		int p4 = 7922;
		int p5 = 9455;
		int p6 = 8997;
		
		System.out.println("Введите код доступа:");
		System.out.print(">>> ");
				
		Scanner vvod = new Scanner(System.in);
		int p = vvod.nextInt();
		
		
		if(p == p1 | p == p2) {
			System.out.println("Открыт доступ в модули базы: А, В, С.");
		}else if(p == p3 | p == p4) {
			System.out.println("Открыт доступ в модули базы: В, С.");
		}else if(p == p5 | p == p6) {
			System.out.println("Открыт доступ в модули базы: С.");
		}else {
			System.out.println("Вы ввели неверный пароль.");
		}
		
	}

}
