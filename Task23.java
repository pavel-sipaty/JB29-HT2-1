package by.jb29.mod1.les03;

import java.util.Scanner;

/*
 * Îïğåäåëèòü ïğàâèëüíîñòü äàòû, ââåäåííîé ñ êëàâèàòóğû (÷èñëî — îò 1 äî 31, ìåñÿö — îò 1 äî 12). Åñëè
ââåäåíû íåêîğğåêòíûå äàííûå, òî ñîîáùèòü îá ıòîì.
 */


public class Task23 {

	public static void main(String[] args) {
		
		int day;
		int month;
		int year;
		
		System.out.print("Ââåäèòå äåíü");
		System.out.print(">>> ");
		
		Scanner d = new Scanner(System.in);
		day = d.nextInt();
		
		//System.out.println(day);
		System.out.println();
		System.out.print("Ââåäèòå ìåñÿö");
		System.out.print(">>> ");
		
		Scanner m = new Scanner(System.in);
		month = m.nextInt();
		
		System.out.println();
		System.out.print("Ââåäèòå ãîä");
		System.out.print(">>> ");
		Scanner y = new Scanner(System.in);
		year = y.nextInt();
		
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			
			if(day >= 1 && day <=31) {
				System.out.println(day + "." + month + "." + year);
			}else {
				System.out.println("Äåíü äîëæåí áûòü îò 1 äî 31.");
			}
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			
			if(day >= 1 && day <=30) {
				System.out.println(day + "." + month + "." + year);
			}else {
				System.out.println("Äåíü äîëæåí áûòü îò 1 äî 30.");
			}
			break;
		case 2:
			
			if(year % 4 != 0) {
				if(day >= 1 && day <= 28) {
					System.out.println(day + "." + month + "." + year);
				}else {
					System.out.println("Äåíü äîëæåí áûòü îò 1 äî 28, ò.ê. ãîä íå âèñîêîñíûé");
					}
			}else if(year % 4 ==0) {
				if(day >= 1 && day <= 29) {
					System.out.println(day + "." + month + "." + year);
				}else {
					System.out.println("Äåíü ìîæåò áûòü îò 1 äî 29 - ãîä âèñîêîñíûé");
					}
			}else {
				System.out.println("Â ôåâğàëå íå ìîæåò áûòü áîëüøå 28 èëè 29 äíåé.");
			}
			break;
		}

	}

}
