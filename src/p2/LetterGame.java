package p2;

public class LetterGame {
	
	String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
	String word = "";
	
	public void setWord(int[] a) {
		 word = "";
		 
		 for(int i = 0; i < a.length; i++) {
			 int x = a[i];
			 char buchstabe = keyString.charAt(x);
			 word = word + buchstabe;
		 }
	}
}
