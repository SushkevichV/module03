package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с массивом символов. Задача 1.
 * Дан массив переменных в camelCase. Преобразовать названия в snake_case.
 */

public class Char01 {

	public static void main(String[] args) {
		String[] a = new String[] {"firstVariable", "secondVariable", "ThirdVariable"};
				  
		for(int s=0; s<a.length; s++) {
			String result = "";
			char ch; // Переменную можно было не создавать, но с ней код более читабельный, а памати она занимает всего 2 байта
			
			ch = a[s].charAt(0); 					// первый символ (символ на нулевой позиции)
			
			result = result + Character.toLowerCase(ch);	// в нижнем регистре 
  
			for (int i = 1; i < a[s].length(); i++) { 	// последующие символы 
  				ch = a[s].charAt(i); 					// символ на позиции i
  
  				if (Character.isUpperCase(ch)) {		// если встретился символ в верхнем регистре
					result = result + '_'; 				
					result = result + Character.toLowerCase(ch); // в нижний регистр 
				} 
  
 				else { 
					result = result + ch; 				// как есть
				}
			}
			a[s]=result;
		}
		
		for(String s: a) {
			System.out.println(s);
		}

	}

}
