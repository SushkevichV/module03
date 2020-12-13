package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с массивом символов. Задача 5.
 * Удалить в строке все лишние пробелы.
 */

public class Char05 {

	public static void main(String[] args) {
		String s = "  Все   лишние   пробелы  удалены  .  ";
		String result = "";
		
		// сначала удаляем все повторяющиеся пробелы
		for (int i = 0; i < s.length(); i++) { 
			if (s.charAt(i)==' ') {
				result=result + s.charAt(i);
				while((i<s.length()-1)&&(s.charAt(i+1)==' ')) {
					i++;
				}
			}
			else {
				result=result + s.charAt(i);
			}
		}
		s=result;
		result="";
				
		// удаляем пробел в начале строки
		// s=s.trim();
		if(s.charAt(0)==' ') {
			for (int i = 1; i < s.length(); i++) { 
				result=result + s.charAt(i);
			}
		}
		s=result;
		result="";

		//удаляем пробел в конце строки
		if(s.charAt(s.length()-1)==' ') {
			for (int i = 0; i < s.length()-1; i++) { 
				result=result + s.charAt(i);
			}
		}
		s=result;
		result="";
		
		//удаляем пробелы перед знаками препинания
		for (int i = 0; i < s.length(); i++) { 
			if (s.charAt(i)==' ') {
				if ((s.charAt(i+1)=='.')||(s.charAt(i+1)==',')||(s.charAt(i+1)=='!')||(s.charAt(i+1)=='?')||(s.charAt(i+1)==':')) {
					i++;
				}
				result=result + s.charAt(i);
			}
			else {
				result=result + s.charAt(i);
			}
		}
		s=result;
		
		System.out.println(s);

	}

}
