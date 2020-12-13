package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 4
 * С помощью функции копирования и операции конкатенации составить из частей
 * слова "информатика" слово "торт".
 */

public class String04 {

	public static void main(String[] args) {
		String s1 = "информатика";
		StringBuilder s2 = new StringBuilder("");
		
		s2.append(s1.charAt(7)).append(s1.charAt(3)).append(s1.charAt(4)).append(s1.charAt(7));
		
		System.out.println(s2.toString());

	}

}
