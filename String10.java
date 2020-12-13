package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 10
 * Строка X состоит из нескольких предложений, каждое из которых заканчивается точкой,
 * восклюцательным или вопросительным знаком.
 * Определить количество предложений в строке X. 
 */

public class String10 {

	public static void main(String[] args) {
		String x = "Привет! Привет. Ты чего такой грустный? Это я такой веселый.";
		String endSymbol = ".!?";
		int count = 0;
				
		for(int i=0; i<x.length(); i++) {
			if(endSymbol.indexOf(x.charAt(i))!=-1) {
				count++;
			}
		}
		
		System.out.printf("В строке %d предложений", count);

	}

}
