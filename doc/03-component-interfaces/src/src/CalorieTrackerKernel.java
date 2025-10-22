
 //Kernel component for tracking food items and their calorie values.
 
public interface CalorieTrackerKernel extends Standard<CalorieTracker> {

    
     //Adds or replaces the calorie value for the given food item.
     
     // @param food the name of the food item
     // @param calories the calorie count associated with the food
  
     //@ensures this contains an entry for food with the specified calories
     
    void addFood(String food, int calories);

  
     // Removes the given food from the tracker.
     
     //@param food; the name of the food item
   
     //@ensures food is no longer in this
     
    void removeFood(String food);

     //Reports the calories for a given food.
    
     //@param food; the name of the food item
     // @return the calories for the specified food
     // @ensures getCalories = calories associated with food
     
    int getCalories(String food);
}

