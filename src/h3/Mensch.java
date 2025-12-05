package h3;

public class Mensch {
	public String name;
	public int gebJahr;
	public int alter;
	
	public void setName(String pName) {
		this.name = pName;
	}
	public void setGebJahr(int pGebJahr) {
		this.gebJahr = pGebJahr;
	}
	public void setAlter() {
		this.alter = 2025-gebJahr;
	}
	public String getName() {
		return name;
	}
	public int getGebJahr() {
		return gebJahr;
	}
	public int getAlter() {
		return alter;
	}
}
