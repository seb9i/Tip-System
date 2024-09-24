import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        // Grabbing user input values
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your bill: ");
        double bill = scan.nextDouble();

        System.out.print("Tip Percent (whole number): ");
        double tipPercent = scan.nextDouble();

        System.out.print("Number of People: ");
        int numberOfPeople = scan.nextInt();

        // Initializing Cash Register Class
        CashRegister cas = new CashRegister(bill, tipPercent, numberOfPeople);

        // Printing the Receipt
        cas.printReceipt();

        // Close Scanner
        scan.close();


    }
}
