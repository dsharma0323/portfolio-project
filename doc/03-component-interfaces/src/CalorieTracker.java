
public interface CalorieTracker extends CalorieTrackerKernel {

    
     //Clears all entries from the tracker
     // @ensures this = empty
     
    void reset();

    // Reports whether the tracker contains no entries.
     // @return true if this contains no food entries
     // @ensures isEmpty = (this has size 0)
     
    boolean isEmpty();

    
      //Returns the average calories per food item (rounded down).
    
     //@return average calories per item
      //@requires size() > 0
     // @ensures averageCalories = totalCalories() / size()
     
     int averageCalories();


    
     //Finds the food item with the highest calorie value.
     
     // return the food name with the maximum calories
     //@requires size() > 0
     // @ensures returnedFood is one of the foods in this with the maximum calories
    
    String highestCalorieFood();
}

