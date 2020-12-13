package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 6
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class String06 {

	public static void main(String[] args) {
		String s1 = "Повторить каждый символ строки дважды";
		StringBuilder s2 = new StringBuilder("");
				
		for(int i=0; i<s1.length(); i++) {
			s2.append(s1.charAt(i)).append(s1.charAt(i));
		}
		
		System.out.println(s2.toString());

	}

}
