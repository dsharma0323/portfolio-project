import java.util.Map;

import components.map.Map1L;

public class CalorieTracker {

    // Map of food items and calorie counts.

    private Map<String, Integer> foodLog;

    //Default constructor.

    public CalorieTracker() {
        this.foodLog = new Map1L<>();
    }

    public void addFood(String name, int calories) {
        // to store name and calories
    }

    //calculate total calories
    public int getTotalCalories() {

        return 0;
    }

    //Clears the tracker for a new day.

    public void clearDay() {

    }

//main method
public static void main(String[] args) {

        // CalorieTracker object
        CalorieTracker tracker = new CalorieTracker();

        // Example data input
        tracker.addFood("cereal", 150);
        tracker.addFood("Salad", 400);
        tracker.addFood("Protein Shake", 250);

        // Display total calories
        out.println("Total calories today: " + tracker.getTotalCalories());

        // Remove a food
        tracker.removeFood("cereal");

        // Show updated total
        out.print("After removing oatmeal:");
        out.print("Total calories: " + tracker.getTotalCalories());

        // Display all foods eaten today
        out.println("Foods logged:");
        tracker.displayFoods(out);
