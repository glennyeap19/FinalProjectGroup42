package application;

public class FoodOptions {
	private String breakfast1;
	private String breakfast2;
	private String breakfast3;

	private String lunch1;
	private String lunch2;
	private String lunch3;
	private String dinner1;
	private String dinner2;
	private String dinner3;
	public static boolean foodsPicked=false;
	private int calories = 0;

	public FoodOptions(String typeOfFood) {
		String regularFood = "Regular";
		String vegetarian = "Vegetarian";
		String vegan = "Vegan";

		if (typeOfFood.equals(regularFood)) {
			this.setBreakfast1("Pancakes, Butter, And Syrup");
			this.setBreakfast2("One bowl of cereal with 2 large bananas");
			this.breakfast3 = "2 eggs 2 bacon 2 toast";
			this.lunch1 = "Taco Hard Shell  with beef and cheese and lettuce";
			this.lunch2 = "Chicken Fried Rice with a side of pop";
			this.lunch3 = "Hamburger with fries";
			this.dinner1 = "Baked Salmon with Garlic and Dijon";
			this.dinner2 = "Steak and rice";
			this.dinner3 = "Spaghetti with tomato sauce and cooked ground beef";
		}
		if (typeOfFood.equals(vegetarian)) {
			this.setBreakfast1("Baked Banana-Nut Oatmeal with a cup of yogurt");
			this.setBreakfast2("Oatmeal, 2 boiled eggs");
			this.breakfast3 = "Thai Curry Pizza & smoothie";
			this.lunch1 = "Veggie Wrap";
			this.lunch2 = "Hummus Bowls";
			this.lunch3 = "2 Veggie Sandwich & salad";
			this.dinner1 = "2 Vegetarian Tacos & smoothie";
			this.dinner2 = "Curried Chickpea Stew & 2 Bread";
			this.dinner3 = "Cheesy Spinach-Zucchini Lasagna";
		}
		if (typeOfFood.equals(vegan)) {
			this.setBreakfast1("Grain Toast with Peanut Butter & Banana");
			this.setBreakfast2("Toast with avocado and a smoothie");
			this.breakfast3 = "3 pancakes with butter and syrup";
			this.lunch1 = "Vegan Superfood Buddha Bowls";
			this.lunch2 = "2 Cheese Pizza & Fries & pop";
			this.lunch3 = "Veggie Sandwich & 2 bananas & orange";
			this.dinner1 = "Vegan Quinoa Salad";
			this.dinner2 = "Chickpea Buddha Bowl";
			this.dinner3 = "Vegan Coconut Chickpea Curry";
		}
	}

	public String getBreakfast3() {
		return breakfast3;
	}

	public void setBreakfast3(String breakfast3) {
		this.breakfast3 = breakfast3;
	}

	public String getLunch1() {
		return lunch1;
	}

	public void setLunch1(String lunch1) {
		this.lunch1 = lunch1;
	}

	public String getLunch2() {
		return lunch2;
	}

	public void setLunch2(String lunch2) {
		this.lunch2 = lunch2;
	}

	public String getLunch3() {
		return lunch3;
	}

	public void setLunch3(String lunch3) {
		this.lunch3 = lunch3;
	}

	public String getDinner1() {
		return dinner1;
	}

	public void setDinner1(String dinner1) {
		this.dinner1 = dinner1;
	}

	public String getDinner2() {
		return dinner2;
	}

	public void setDinner2(String dinner2) {
		this.dinner2 = dinner2;
	}

	public String getDinner3() {
		return dinner3;
	}

	public void setDinner3(String dinner3) {
		this.dinner3 = dinner3;
	}

	public String getBreakfast1() {
		return breakfast1;
	}

	public void setBreakfast1(String breakfast1) {
		this.breakfast1 = breakfast1;
	}

	public String getBreakfast2() {
		return breakfast2;
	}

	public void setBreakfast2(String breakfast2) {
		this.breakfast2 = breakfast2;
	}

}