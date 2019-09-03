package by.jb29.mod1.les03;

import java.util.Scanner;

/*
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся
мальчики!».
 */



public class Task21 {

	public static void main(String[] args) {
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М.");
		System.out.print(">>> ");
		
		Scanner kto = new Scanner(System.in);
		
		String str;
		char ch;
		//char d = ch1;
		
		//char m ;
		
		str = kto.next();
		
		ch = str.charAt(0);
		
		
		if (ch == 'Д') {
			System.out.println("Мне нравятся мальчики!");
		}else if(ch == 'М') {
			System.out.println("Мне нравятся девочки!");
		}else {
			System.out.println("Вы ввели что-то не то: " + ch);
		}
		

	}

}
