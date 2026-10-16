import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        //Vars
        Scanner scan = new Scanner(System.in);
        double goal = 0;
        boolean goalCheck = false;
        boolean depCheck = false;
        double total = 0;
        double deposit = 0;
        int numDep = 0;

        //Inputs
        do {
            System.out.println("Enter savings goal:");

            if (scan.hasNextDouble()) {
                goal = scan.nextDouble();

                if (goal > 0) {
                    goalCheck = true;
                } else {
                    System.out.println("Error.");
                }
            } else {
                System.out.println("Error.");
            }

            scan.nextLine();
        } while(!goalCheck);

        //Depositing
        do {
            System.out.println("Current Savings Total: $" + total);
            System.out.println("Enter deposit amount:");

            if (scan.hasNextDouble()) {
                deposit = scan.nextDouble();

                if (deposit >= 0) {
                    total += deposit;
                    numDep++;

                    if (total >= goal) {
                        depCheck = true;
                    }
                } else {
                    System.out.println("Error.");
                }
            } else {
                System.out.println("Error.");
            }

            scan.nextLine();
        } while(!depCheck);

        //Outputs
        System.out.println("Number of Deposits: " + numDep);
        System.out.println("Total Saved: $" + total);
        System.out.println("Excess: $" + (total - goal));
    }
}