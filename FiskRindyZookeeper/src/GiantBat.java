
public class GiantBat extends Mammal {
	
	public GiantBat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("Giant Bat is flying. Watch Out!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Yum Yum Yum Burp");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("It's Mothra.. NO IT'S A GIANT BAT! RUN!!!!");
		this.energyLevel -= 100;
	}
}
