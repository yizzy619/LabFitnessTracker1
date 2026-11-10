import java.util.Scanner;

//Parent class
class Workout{
    String type;
    int duration;

    void showWorkout(){
        System.out.println("Workout Type: " + type);
        System.out.println("Duration: " + duration + " minutes");

    }
}

//Child class
class RunningWorkout extends Workout {
    double distance;

    void showDetails(){
        showWorkout();

        System.out.println("Distance: " + distance + "km ");
        double calories = distance * 60;

        System.out.println("Calories Burned: " + calories);
    }
}

//Main class
public class Main{
        public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    RunningWorkout workout =new RunningWorkout();

            System.out.print("Enter workout type: ");
                workout.type =input.nextLine();

            System.out.print("Enter duration in minutes: ");
                workout.distance =input.nextInt();

            System.out.print("Enter distance in KM: ");
                workout.distance =input.nextDouble();

            System.out.println("=== Workout Detials ===");

                workout.showDetails();

                input.close();

    }
}