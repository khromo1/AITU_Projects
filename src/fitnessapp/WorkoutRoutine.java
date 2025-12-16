package fitnessapp;

public class WorkoutRoutine {
    private String workoutName;
    private int duration;
    private String[] exercises;
    public WorkoutRoutine(String workoutName, String[] exercises, int duration) {
        this.workoutName = workoutName;
        this.duration = duration;
        this.exercises = exercises;
    }
    public String getWorkoutName() {
        return workoutName;
    }
    public String[] getExercises() {
        return exercises;
    }
    public int getDuration() {
        return duration;
    }
}
