import inout.Console;
public class Palindrom {
	public static char[] readCharArray() {
		String text = new java.util.Scanner(System.in).nextLine();
		return text.toCharArray();
	}
	
	public static void main(String args[]) {
		char[] text;
		
		System.out.println("Geben Sie ein char ein");
		text = readCharArray();
		boolean istPalindrom = true;
		for ( int i = 0, j = text.length - 1; i < j; i++, j--) {
			if (text[i] == ' ') i++;
			if (text[j] == ' ') j--;
		//	System.out.println(i + "\t" + j);
			if (text[i] != text[j]) {
				istPalindrom = false;
				break;
			}
			
		}
		if (istPalindrom) 
			System.out.println("Palindrom");
		else 
			System.out.println("Kein Palindrom");
		for( int i = 0; i < text.length; i++) 
			System.out.print(text[i]);
	}
}
		