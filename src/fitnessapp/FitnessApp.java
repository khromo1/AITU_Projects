package fitnessapp;
import java.util.Scanner;
public class FitnessApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        User user = new User(name, age);
        System.out.println("Chose your type of workout: 1 - strength, 2- cardio");
        int type = scanner.nextInt();
        scanner.nextLine();
        String workoutName;
        String[] exercises;
        if (type==1) {
            workoutName = "Stength workout";
            exercises = new String[]{"Pull ups", "Push ups", "Squats", "Sit ups"};
        } else if (type==2) {
            workoutName = "Cardio";
            exercises = new String[]{"Running", "Jumping rope", "Burpees"};
        } else {
            System.out.println("Nonexistent choice");
            return;
        }
        System.out.println("Choose your level: 1 - beginner, 2 - intermediate or 3 - pro");
        int level = scanner.nextInt();
        scanner.nextLine();
        int duration;
        if (level==1) {
            duration = 30;
        } else if (level==2) {
            duration = 60;
        } else if (level==3) {
            duration = 90;
        } else {
            System.out.println("Nonexistent choice");
            return;
        }
        WorkoutRoutine workout = new WorkoutRoutine(workoutName, exercises, duration);
        System.out.println("\n   My Fitness App   ");
        System.out.println("User: " + user.getName() + ", age: " + user.getAge());
        System.out.println("Workout: " + workout.getWorkoutName());
        System.out.println("Exercises: ");
        for (String ex : workout.getExercises()) {
            System.out.println("- " + ex);
        }
        System.out.println("Duration: " + workout.getDuration() + " min");
        scanner.close();
    }
}
