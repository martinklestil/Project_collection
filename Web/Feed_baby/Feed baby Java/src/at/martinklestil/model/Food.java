package at.martinklestil.model;

/**
 * 
 * @author Martin Klestil
 * Data Klasse um das Essen mit seinen Eigenschaften zu deklarieren.
 *
 */

public class Food {
	
	private int ml;
	private String foodType;
	
	
	public Food(int ml, String foodType) {
		super();
		this.ml = ml;
		this.foodType = foodType;
	}


	public int getMl() {
		return ml;
	}


	public void setMl(int ml) {
		this.ml = ml;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	@Override
	public String toString() {
		return "Food [ml=" + ml + ", foodType=" + foodType + "]";
	}
	
	
	
	
	

}
