import components.map.Map;
import components.map.Map1L;

public class CalorieTracker1L implements CalorieTracker {

    private Map<String, Integer> foodLog;

    public CalorieTracker1L() {
        this.foodLog = new Map1L<>();
    }

    @Override
    public void addFood(String name, int calories) {
        this.foodLog.add(name, calories);
    }

    @Override
    public void removeFood(String name) {
        this.foodLog.remove(name);
    }

    @Override
    public int getCalories(String name) {
        return this.foodLog.value(name);
    }

    @Override
    public int getTotalCalories() {
        int total = 0;
        for (Map.Pair<String, Integer> pair : this.foodLog) {
            total += pair.value();
        }
        return total;
    }

    @Override
    public Iterable<String> foods() {
        return this.foodLog;
    }

    @Override
    public void clearDay() {
        this.foodLog.clear();
    }
}
