package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 1
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов.
 */

public class String01 {

	public static void main(String[] args) {
		String s = "  Найдите    наибольшее  количество     подряд  идущих пробелов.  ";
		int max = 0;
		int count = 0;
		
		if (s.charAt(0)==' ') {
			count++;
		}
		
		for (int i = 1; i < s.length(); i++) { 
			if (s.charAt(i)==' ') {
				if(s.charAt(i-1)==' ') {
					count++;
				}
				else {
					if(count>max) {
						max=count;
					}
					count = 1;
				}
			}
			if(count>max) {
				max=count;
			}
		}
		
		System.out.println("Наибольшее количество подряд идущих пробелов - "+max);

	}

}
