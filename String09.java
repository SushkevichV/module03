package by.tce.jonline.modul3;

import java.util.Scanner;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 9
 * Посчитать количество строчных и прописных букв в введенной строке.
 * Учитывать только английские буквы.
 */

public class String09 {

	public static void main(String[] args) {
		String s = "";
		s = console();
		int big = 0;
		int small = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(((byte)s.charAt(i)>64)&&((byte)s.charAt(i)<91)){
				big++;
			}
			
			if(((byte)s.charAt(i)>96)&&((byte)s.charAt(i)<123)){
				small++;
			}
		}
		
		System.out.printf("В строке %d строчных и %d прописных букв", small, big);

	}

	public static String console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите строку >> ");
		
		return scanner.nextLine();
	}
}
