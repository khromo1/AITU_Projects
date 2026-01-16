package fitnessapp;

import java.util.ArrayList;
import java.util.Scanner;

public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<WorkoutRoutine> workouts = new ArrayList<>();

        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            User user = new User(name);
            System.out.print("Enter your worlout duration (only number): ");
            int duration = scanner.nextInt();
            workouts.add(new CardioWorkout("Running", duration));
            workouts.add(new StrengthWorkout("Gym", 60));
            System.out.println("\nUser: " + user.getName());
            System.out.println("Workouts: ");
            
            for (WorkoutRoutine w : workouts) {
                System.out.println(w);
                w.track();
            }

        } catch (Exception e) {
            System.out.println("Input error! Please try again.");

        } finally {
            scanner.close();

        }
    }
}