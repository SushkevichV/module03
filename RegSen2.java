package by.tce.jonline.modul3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/* Модуль 3. Работа с регулярными выражениями. Задача 2
 * Дана строка, содержащая текст (xml-документ). Написать анализатор, позволяющий последовательно 
 * возвращать содержимое узлов xml-документа и его тип (открывающий тег, закрывающий тег, 
 * содержимое тега, тег без тела).
 */

public class RegSen2 {

	public static void main(String[] args) {
		String str;
		
		str = "<notes>\n\t<note id = \"1\">\n\t\t<to>Вася</to>\n\t\t<from>Света</from>\n\t\t<heading>Напоминание</heading>\n\t\t<body>Повони мне завтра!</body>\n\t</note>\n\t<note id = \"2\">\n\t\t<to>Петя</to>\n\t\t<from>Маша</from>\n\t\t<heading>Важное напоминание</heading>\n\t\t<body/>\n\t</note>\n</notes>";
		
		String[] s = str.split("\n");
		
		Pattern patOpen = Pattern.compile("<(\\w)+(\\sid\\s=\\s\"\\d+\")*>");
		Pattern patClose = Pattern.compile("</[a-z]+>");
		Pattern patEmpty = Pattern.compile("<[a-z]+/>");
		Pattern patBody = Pattern.compile(">([А-я]+)(\\s*([А-я]+))*([\\.!?]*)<");
				
		for (int i=0; i<s.length; i++) {
			Matcher matOpen = patOpen.matcher(s[i]);
			Matcher matClose = patClose.matcher(s[i]);
			Matcher matBody = patBody.matcher(s[i]);
			Matcher matEmpty = patEmpty.matcher(s[i]);
			
			if (matEmpty.find()) {
				System.out.println(s[i].substring(matEmpty.start(), matEmpty.end()) +" - тег без тела");
			}
			if (matOpen.find()) {
				System.out.println(s[i].substring(matOpen.start(), matOpen.end()) +" - открывающий тег");
			}
			if (matBody.find()) {
				System.out.println(s[i].substring(matBody.start()+1, matBody.end()-1) +" - содержимое тега");
			}
			if (matClose.find()) {
				System.out.println(s[i].substring(matClose.start(), matClose.end()) +" - закрывающий тег");
			}
			
		}
		
	}

}
