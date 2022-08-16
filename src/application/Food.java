package application;

import java.util.HashMap;

public abstract class Food {
    /**
     * Food base class which can be inherited by any food
     */
    protected HashMap<String,Nutrient> Food_Nutrients;
    abstract int[] calculateCalories(Breakfast breakfast, Lunch lunch, Dinner dinner);
}
