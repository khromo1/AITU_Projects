package fitnessapp;

import java.util.Objects;

public abstract class WorkoutRoutine {
    protected String name;
    protected int duration;

    public WorkoutRoutine(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() { return name; }
    public int getDuration() { return duration; }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " workout: " + name + ", duration: " + duration + " min";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkoutRoutine)) return false;
        WorkoutRoutine that = (WorkoutRoutine) o;
        return duration == that.duration && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration);
    }
}
