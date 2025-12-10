public abstract class CalorieTrackerSecondary implements CalorieTracker {

    @Override
    public int getTotalCalories() {
        int total = 0;
        for (String food : this.foods()) {
            total += this.getCalories(food);
        }
        return total;
    }

    public int averageCalories() {
        int count = 0;
        int total = 0;
        for (String food : this.foods()) {
            total += this.getCalories(food);
            count++;
        }
        return count == 0 ? 0 : total / count;
    }

    @Override
    public void clearDay() {
        for (String food : this.foods()) {
            this.removeFood(food);
        }
    }

    public boolean isEmpty() {
        return !this.foods().iterator().hasNext();
    }
}
