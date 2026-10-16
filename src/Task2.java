import java.util.Scanner;

public class Task2 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        int terms = 0;
        boolean check = false;
        int currentTerm;
        int prevTerm = 1;
        int prev2Term = 0;

        //Inputs
        do {
            System.out.println("Enter number of terms:");

            if (scan.hasNextInt()) {
                terms = scan.nextInt();

                if (terms > 0) {
                    check = true;
                } else {
                    System.out.println("Error.");
                }
            } else {
                System.out.println("Error.");
            }

            scan.nextLine();
        } while(!check);

        //Outputs
        if (terms == 1) {
            System.out.print(" " + prev2Term);
        } else if (terms == 2) {
            System.out.print(" " + prev2Term + " " + prevTerm);
        } else {
            System.out.print(" " + prev2Term + " " + prevTerm);

            for (int i = 0; i < terms - 2; i++) {
                currentTerm = prevTerm + prev2Term;

                System.out.print(" " + currentTerm);

                prev2Term = prevTerm;
                prevTerm = currentTerm;
            }
        }
    }
}
