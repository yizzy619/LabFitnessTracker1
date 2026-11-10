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

    RunningWorkout r =new RunningWorkout();

            System.out.print("Enter workout type: ");
            r.type =input.nextLine();

            System.out.print("Enter duration in minutes: ");
            r.duration =input.nextInt();

            System.out.print("Enter distance in KM: ");
            r.distance =input.nextDouble();

            System.out.println("=== Workout Details ===");

            r.showDetails();

            input.close();

    }
}
