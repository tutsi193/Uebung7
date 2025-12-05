package h1;

public class Zahl {
	public boolean even;
	public boolean small;
	public boolean positive;
	public int num = 111;
	
	public void setEven() {
		if(num % 2 == 0) {
			even = true;
		}else {even = false;}
		System.out.println("Even: " + even);
	}
	
	public void setSmall() {
		if(num < 100) {
			small = true;
		}else {small = false;}
		System.out.println("Small: " + small);
	}
	
	public void setPositive() {
		if(num > 0) {
			positive = true;
		}else {positive = false;}
		System.out.println("Positive: " + positive);
	}
}
