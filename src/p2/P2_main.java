package p2;

public class P2_main {
	public static void main(String []args) {
		LetterGame l = new LetterGame();
		
		int[] b = {14,2,0,0,19,19};
		l.setWord(b);
		System.out.println(l.word);
	}
}
/*echo "# Uebung7" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote set-url origin https://github.com/tutsi193/Uebung7.git
git push -u origin main*/
