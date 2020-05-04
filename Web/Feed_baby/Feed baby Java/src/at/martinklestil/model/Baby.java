package at.martinklestil.model;

/**
 * 
 * @author Martin Klestil
 * Data Klasse um ein Baby mit seinen Eigenschaften zu beschreiben.
 *
 */

public class Baby {
	
	private int weight;
	private int age;
	public Baby(int weight, int age) {
		super();
		this.weight = weight;
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Baby [weight=" + weight + ", age=" + age + "]";
	}
	
	

	
	
}
