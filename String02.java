package by.tce.jonline.modul3;

/* Модуль 3. Работа со строкой как с объектом типа String или StringBuilder. Задача 2
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

public class String02 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Find all the words containing your letter. The most useful tool for WWF, Scrabble, and other word games.");
		
		for(int i=0; i<s.length(); i++) {
			if(s.indexOf("a", i)!=-1) {
				s.insert((s.indexOf("a", i)+1), "b");
				i=s.indexOf("a", i)+1;
			}
		}
		
		System.out.println(s.toString());

	}

}
