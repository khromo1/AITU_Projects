package fitnessapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<WorkoutRoutine> workouts = new ArrayList<>();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        User user = new User(name, age);

        workouts.add(new StrengthWorkout("Upper Body", 60));
        workouts.add(new CardioWorkout("Morning Run", 30));
        workouts.add(new StrengthWorkout("Leg Day", 90));
        workouts.add(new CardioWorkout("HIIT", 45));

        System.out.println("\n    All workouts    ");
        for (WorkoutRoutine w : workouts) {
            System.out.println(w);
        }

        System.out.println("\n    Filter: Cardio workouts    ");
        for (WorkoutRoutine w : workouts) {
            if (w instanceof CardioWorkout) {
                System.out.println(w);
            }
        }

        System.out.println("\n    Search: duration > 40    ");
        for (WorkoutRoutine w : workouts) {
            if (w.getDuration() > 40) {
                System.out.println(w);
            }
        }

        workouts.sort(Comparator.comparingInt(WorkoutRoutine::getDuration));

        System.out.println("\n    Sorted by duration    ");
        for (WorkoutRoutine w : workouts) {
            System.out.println(w);
        }

        scanner.close();
    }
}
