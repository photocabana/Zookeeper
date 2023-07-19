
public class Gorilla extends Mammal {
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something. Watch Out!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Yum Yum Yum Burp");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla has climed a tree. Where did they go?");
		this.energyLevel -= 10;
	}
}
