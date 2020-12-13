package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с массивом символов. Задача 2.
 * Заменить в строке все вхождения word на letter.
 */

public class Char02 {

	public static void main(String[] args) {
		String s = "Find all the words containing your letter. The most useful tool for WWF, Scrabble, and other word games.";
		//s=s.replaceAll("word", "letter");
		String result = "";
		
		for (int i = 0; i < s.length(); i++) { 
			char ch = s.charAt(i); 
			
			if ((ch=='w')||(ch=='W')) {
				if(s.charAt(i+1)=='o') {
					if(s.charAt(i+2)=='r') {
						if(s.charAt(i+3)=='d') {
							if(ch=='w') {
								result=result+"letter";
							}
							else {
								result=result+"Letter";
							}
							i=i+3;
						}
					}
				}
			}

			else { 
				result = result + ch;
			}
		}
		s=result;
		
		System.out.println(s);

	}

}
