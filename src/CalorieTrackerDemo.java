public class CalorieTrackerDemo {

    public static void main(String[] args) {

        CalorieTracker tracker = new CalorieTracker1L();

        tracker.addFood("cereal", 150);
        tracker.addFood("Salad", 400);
        tracker.addFood("Protein Shake", 250);

        System.out.println("Total calories today: " + tracker.getTotalCalories());

        tracker.removeFood("cereal");

        System.out.println("After removing cereal:");
        System.out.println("Total calories: " + tracker.getTotalCalories());

        System.out.println("Foods logged:");
        for (String food : tracker.foods()) {
            System.out.println(food);
        }
    }
}
