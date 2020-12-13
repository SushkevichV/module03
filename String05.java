package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 5
 * Подсчитать, сколько раз среди символов заданной строки встречается буква "a".
 */

public class String05 {

	public static void main(String[] args) {
		String s = "Find all the words containing your letter. The most useful tool for WWF, Scrabble, and other word games.";
		char c = 'a';
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		
		System.out.printf("В заданной строке буква '%c' встречается %d раз.",c,count);

	}

}
