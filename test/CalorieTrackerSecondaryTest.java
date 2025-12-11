import static org.junit.Assert.*;
import org.junit.Test;

public class CalorieTrackerSecondaryTest {

    private static class TestTracker extends CalorieTrackerSecondary {
        private final CalorieTracker tracker = new CalorieTracker1L();

        @Override
        public void addFood(String name, int calories) {
            tracker.addFood(name, calories);
        }

        @Override
        public void removeFood(String name) {
            tracker.removeFood(name);
        }

        @Override
        public int getCalories(String name) {
            return tracker.getCalories(name);
        }

        @Override
        public Iterable<String> foods() {
            return tracker.foods();
        }

        @Override
        public void clearDay() {
            tracker.clearDay();
        }
    }

    @Test
    public void testIsEmptyTrue() {
        TestTracker tracker = new TestTracker();
        assertTrue(tracker.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        TestTracker tracker = new TestTracker();
        tracker.addFood("oatmeal", 150);

        assertFalse(tracker.isEmpty());
    }

    @Test
    public void testAverageCalories() {
        TestTracker tracker = new TestTracker();
        tracker.addFood("burger", 500);
        tracker.addFood("fries", 300);

        assertEquals(400, tracker.averageCalories());
    }

    @Test
    public void testClearDayFromSecondary() {
        TestTracker tracker = new TestTracker();
        tracker.addFood("pasta", 600);
        tracker.addFood("salad", 200);

        tracker.clearDay();

        assertEquals(0, tracker.getTotalCalories());
        assertTrue(tracker.isEmpty());
    }
}
