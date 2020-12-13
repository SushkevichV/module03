package by.tce.jonline.modul3;

import java.util.Scanner;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 7
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 */

public class String07 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		int count = 1;
		boolean duplicate;
		
		s = console();
				
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf(" ", i)!=-1) {
				s.deleteCharAt(s.indexOf(" ", i));
			}
		}
		
		char[] c = new char[s.length()];
		s.getChars(0, s.length(), c, 0);
		s.setCharAt(0, c[0]);
		
		for (int i = 1; i < c.length; i++) {
		    duplicate = false;
	    	for (int j = 0; j<i; j++) {
	    		if (c[i]==c[j]) {
	    			duplicate = true;
	    			break;
	    		}
	    	}
	    	if (!duplicate) {
	    		s.setCharAt(count, c[i]);
	    		count++;
	    	}
		}
		s.setLength(count);
		System.out.println(s.toString());

	}
	
	public static StringBuilder console() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		
		System.out.print("Введите строку >> ");
		
		s.append(scanner.nextLine());
		
		return s;
	}

}
