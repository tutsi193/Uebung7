package h3;

public class H3_main {
	public static void main(String[] args) {
		Mensch m1 = new Mensch();
		
		m1.setName("Tugce");
		m1.setGebJahr(2006);
		m1.setAlter();
		
		System.out.println("Name: " + m1.getName());
		System.out.println("Alter: " + m1.getAlter());
	}
	
}
