package fitnessapp;

public abstract class WorkoutRoutine implements Trackable {
    protected String name;
    protected int duration;

    public WorkoutRoutine(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + "workout: " + name + " (" + duration + "min)";
    }
}