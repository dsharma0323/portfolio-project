public interface CalorieTracker {

    void addFood(String name, int calories);

    void removeFood(String name);

    int getCalories(String name);

    int getTotalCalories();

    Iterable<String> foods();

    void clearDay();
}
