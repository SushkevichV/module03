package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с массивом символов. Задача 4.
 * В строке найти количество чисел.
 */

public class Char04 {

	public static void main(String[] args) {
		String s = "Find 1 all 56 numbers in a 794 string.";
		int count = 0;
				
		for (int i = 0; i < s.length(); i++) { 
			if (number(s.charAt(i))>0) {
				count++;
				while(number(s.charAt(i))>0) {
					i++;
				}
			}
		}
		System.out.println("Количество чисел в строке - "+ count);

	}

	private static int number(char ch) {
		int count = 0;
		
		if((ch=='0')||(ch=='1')||(ch=='2')||(ch=='3')||(ch=='4')||(ch=='5')||(ch=='6')||(ch=='7')||(ch=='8')||(ch=='9')) {
			count++;
		}
		return count;
	}

}
