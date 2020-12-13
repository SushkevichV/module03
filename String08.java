package by.tce.jonline.modul3;

import java.util.Scanner;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 8
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
 * его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class String08 {

	public static void main(String[] args) {
		String s = "";
		int max;
		String maxs = "";
		
		s=console();
		
		String[] str = s.split(" ");
		max=str[0].length();
		maxs=str[0];
		
		for(int i=0; i<str.length; i++) {
			if (max<str[i].length()) {
				max=str[i].length();
				maxs=str[i];
			}
		}
		
		System.out.println("Самое длинное слово в строке >> \""+maxs+"\"");

	}
	
	public static String console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Введите строку >> ");
		
		return scanner.nextLine();
	}
}
