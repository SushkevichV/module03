package by.tce.jonline.modul3;

/* Модуль 3. Работа с регулярными выражениями. Задача 1
 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять 
 * с текстом три различные операции: отсортировать абзацы по количеству предложений; 
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, 
 * а в случае равенства - по алфавиту
 */

public class RegSen1 {

	public static void main(String[] args) {
		String text = new String ("Meet my family. There are five of us, my parents, my elder brother, my baby sister and me.\nFirst, meet my mum and dad, Jane and Michael. My mum enjoys reading and my dad enjoys playing chess with my brother Ken. My mum is slim and rather tall. She has long red hair and big brown eyes. She has a very pleasant smile and a soft voice. My mother is very kind and understanding.\nMy sister is very small and funny. She sleeps, eats and sometimes cries. We all help our mother and let her have a rest in the evening.");
		String[] paragraph; // Абзацы
		char c = 's'; 		// заданный символ
				
		paragraph = text.split("\n");
		
		String[][] sentence = new String[paragraph.length][]; // Предложения
		
		for (int i=0; i<paragraph.length; i++) {
			sentence[i] = paragraph[i].split("[!?\\.]");
		}
		
		for (int i=sentence.length-1; i>=0; i--) {	// сортировка абзацев
			for (int k=0; k<i; k++) {
				if(sentence[k].length>sentence[k+1].length) {
					String[] tmp = sentence[k];
					sentence[k]=sentence[k+1];
					sentence[k+1]=tmp;
				}
			}
		}
		
		System.out.println("<<< Отсортированные абзацы >>>");
		for (int i=0; i<sentence.length; i++) {
			for (int j=0; j<sentence[i].length; j++) {
				System.out.print(sentence[i][j]+".");
			}
			System.out.println();
		}
		
		System.out.printf("%n<<< Отсортированные предложения >>>%n");
		for (int i=0; i<sentence.length; i++) {
			for (int j=0; j<sentence[i].length; j++) {
				sentence[i][j] = sortWord(sentence[i][j]);
				System.out.print(sentence[i][j]+". ");
			}
			System.out.println();
		}
		
		System.out.printf("%n<<< Отсортированные лексемы по убыванию количества вхождений символа '%c' >>>%n", c);
		for (int i=0; i<sentence.length; i++) {
			for (int j=0; j<sentence[i].length; j++) {
				sentence[i][j] = sortLexeme(sentence[i][j], c);
				System.out.print(sentence[i][j]+". ");
			}
			System.out.println();
		}
		
	}

	private static String sortWord(String str) { //сортировка слов в предложении по длине 
		str = str.trim();
		String[] s = str.split(" ");
		
		for(int i=s.length-1; i>0; i--) {
			for(int k=0; k<i; k++) {
				if (s[k].length()>s[k+1].length()) {
					String tmp=s[k];
					s[k]=s[k+1];
					s[k+1]=tmp;
				}
			}
		}
		
		str="";
		for (int i=0; i<s.length-1; i++) {
			str+=s[i]+" ";
		}
		str+=s[s.length-1]; // последний без пробела
		
		return str;
	}
	
	private static String sortLexeme(String str, char c) { //сортировка лексем по убыванию количества вхождений
		str = str.trim();
		String[] s = str.split(" ");
		
		for(int i=s.length-1; i>0; i--) {
			for(int k=0; k<i; k++) {
				if (lexeme(s[k], c)<lexeme(s[k+1], c)) {
					String tmp=s[k];
					s[k]=s[k+1];
					s[k+1]=tmp;
				}
				if ((lexeme(s[k], c)==lexeme(s[k+1], c))&&(lexeme(s[k], c)>0)) {
					boolean rotate = alfaSort(s[k], s[k+1]);
					if (rotate) {
						String tmp = s[k];
						s[k]=s[k+1];
						s[k+1]=tmp;
					}
				}
			}
		}
		
		str="";
		for (int i=0; i<s.length-1; i++) {
			str+=s[i]+" ";
		}
		str+=s[s.length-1]; // последний без пробела
		
		return str;
	}

	private static boolean alfaSort(String s1, String s2) { // сортировка по алфавиту
		boolean rotate = false;
		int l = s1.length();
		
		if (s1.length()>s2.length()) {
			l=s2.length();
		}
		
		for(int i=0; i<l; i++) {
			if((byte)s1.charAt(i)>(byte)s2.charAt(i)) {
				rotate = true;
				break;
			}
		}
		return rotate;
	}	
	
	private static int lexeme(String str, char c) { // определение количества вхождений заданного символа
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

}
