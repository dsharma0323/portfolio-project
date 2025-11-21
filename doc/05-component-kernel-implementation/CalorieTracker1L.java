import components.map.Map;
import components.map.Map1L;

public class CalorieTracker1L extends CalorieTrackerSecondary {
  
    private Map<String, Integer> map;

   
    public CalorieTracker1L() {
        this.map = new Map1L<>();
    }

    @Override
    public void addFood(String food, int calories) {
        this.map.add(food, calories);
    }

    @Override
    public void removeFood(String food) {
        this.map.remove(food);
    }

    @Override
    public int getCalories(String food) {
        return this.map.value(food);
    }

    @Override
    public Map<String, Integer> foods() {
  
        Map<String, Integer> copy = new Map1L<>();
        for (Map.Pair<String, Integer> p : this.map) {
            copy.add(p.key(), p.value());
        }
        return copy;
    }

    @Override
    protected void clear() {
        this.map.clear();
    }
}

