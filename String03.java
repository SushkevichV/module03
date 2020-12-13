package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 3
 * Проверить, является ли заданное слово палиндромом.
 */

public class String03 {

	public static void main(String[] args) {
		String s = "топот";
		
		s=s.toLowerCase(); // все буквы к одному регистру
		
		for(int i=0; i<=s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				System.out.println("Слово \""+s+"\" не является палиндромом.");
				break;
			}
			else {
				if (i==s.length()/2) {
					System.out.println("Слово \""+s+"\" является палиндромом.");
				}
			}
		}
	}

}
