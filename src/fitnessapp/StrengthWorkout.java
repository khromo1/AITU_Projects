package fitnessapp;

public class StrengthWorkout extends WorkoutRoutine {
    
    public StrengthWorkout(String name, int duration) {
        super(name, duration);
    }

    @Override
    public String getType() {
        return "Strength";
    }
    @Override
    public void track() {
        System.out.println("Tracking strength workout: " + name);
    }
}