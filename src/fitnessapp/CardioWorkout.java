package fitnessapp;

public class CardioWorkout extends WorkoutRoutine {
    public CardioWorkout(String name, int duration) {
        super(name, duration);
    }

    @Override
    public String getType() {
        return "Cardio";
    }

    @Override
    public void track() {
        System.out.println("Tracking cardio workout: " + name);
    }
}
