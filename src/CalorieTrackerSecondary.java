public abstract class CalorieTrackerSecondary implements CalorieTracker {

    public int totalCalories() {
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
        if (count == 0) {
            return 0; 
        }
        return total / count;
    }

    @Override
    public void reset() {
        for (String food : this.foods()) {
            this.removeFood(food);
        }
    }

    public boolean isEmpty() {
        return !this.foods().iterator().hasNext(); 
    }

 
    public String toString() {
        StringBuilder sb = new StringBuilder("CalorieTracker: ");
        for (String food : this.foods()) {
            sb.append(food)
              .append(" = ")
              .append(this.getCalories(food))
              .append(" cal, ");
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CalorieTracker)) {
            return false;
       
        }
        
      CalorieTracker other = (CalorieTracker) obj;
        for (String food : this.foods()) {
            if (this.getCalories(food) != other.getCalories(food)) {
                return false;
            }
        }
        return true;
    }
}

