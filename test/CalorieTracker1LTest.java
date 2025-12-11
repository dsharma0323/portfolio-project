import static org.junit.Assert.*;
import org.junit.Test;

public class CalorieTracker1LTest {

    @Test
    public void testAddFoodAndGetCalories() {
        CalorieTracker tracker = new CalorieTracker1L();
        tracker.addFood("apple", 95);

        int calories = tracker.getCalories("apple");
        assertEquals(95, calories);
    }

    @Test
    public void testRemoveFood() {
        CalorieTracker tracker = new CalorieTracker1L();
        tracker.addFood("banana", 110);
        tracker.removeFood("banana");

        assertEquals(0, tracker.getTotalCalories());
    }

    @Test
    public void testGetTotalCaloriesMultipleFoods() {
        CalorieTracker tracker = new CalorieTracker1L();
        tracker.addFood("toast", 80);
        tracker.addFood("eggs", 140);
        tracker.addFood("juice", 120);

        assertEquals(340, tracker.getTotalCalories());
    }

    @Test
    public void testClearDay() {
        CalorieTracker tracker = new CalorieTracker1L();
        tracker.addFood("pizza", 300);
        tracker.addFood("shake", 250);

        tracker.clearDay();

        assertEquals(0, tracker.getTotalCalories());
    }

    @Test
    public void testFoodsIterable() {
        CalorieTracker tracker = new CalorieTracker1L();
        tracker.addFood("rice", 200);

        boolean found = false;
        for (String food : tracker.foods()) {
            if (food.equals("rice")) {
                found = true;
            }
        }

        assertTrue(found);
    }
}
