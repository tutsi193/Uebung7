package p1;

public class P1_main {
	public static void main(String []args) {
		Bruch a = new Bruch(2,3);
		Bruch b = new Bruch(4,5);
		multFrac(5,2,3,4);
	}
	public static void multFrac(int z1, int n1, int z2, int n2) {
		System.out.println((z1 * z2) + ":" + (n1 * n2));
	}
	
	public static void multFrac(Bruch a, Bruch b) {
		int ergebnisZ = a.z * b.z;
		int ergebnisN = a.n * b.n;
		
		Bruch ergebnis = new Bruch(ergebnisZ, ergebnisN);
		System.out.println(ergebnis);
	}
}
/*echo "# Uebung7" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote set-url origin https://github.com/tutsi193/Uebung7.git
git push -u origin main*/
