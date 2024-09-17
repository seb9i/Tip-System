import java.util.Scanner;

class cashRegister {
    // Initializing variables that are part of the final receipt
    private final double tipAmount;
    public double bill;
    public int numberofPeople;
    public double tipPercentage;
    private final double finalBill;
    private final double tipPerPerson;
    private final double finalPerPerson;

    // Class constructor that accepts the bill, tip percentage, and the number of people
    public cashRegister(double userBill, double usertipPercentage, int usernumberofPeople) {

        // Calculations
        bill = userBill;
        tipPercentage = usertipPercentage / 100;
        numberofPeople = usernumberofPeople;

        tipAmount = tipPercentage * bill;
        finalBill = tipAmount + bill;

        tipPerPerson = tipAmount / numberofPeople;
        finalPerPerson = finalBill / numberofPeople;

    }

    // Methods to return values
    public double getTipAmount(){
        return tipAmount;
    }
    public double getFinalBill(){
        return finalBill;
    }
    public double getTipPerPerson(){
        return tipPerPerson;
    }
    public double getFinalPerPerson() {
        return finalPerPerson;
    }

    // Prints out the receipt
    public void printReceipt() {
        System.out.printf("""
                            --------------------------
                            Not Burger King
                            --------------------------
                            Total Tip Amount: %.2f
                            Total Bill Cost: %.2f
                            Tip Per Person: %.2f
                            Final Bill Per Person: %.2f""", getTipAmount(), getFinalBill(), getTipPerPerson(), getFinalPerPerson());
    }
}
// Class representing the table of people that are ordering
class Table {
    public int numberOfPeople;
    public double Bill;
    public double tipPercentage;

    // Initializer that represents the bill, number of people ordering, and the tip percentage
    public Table(double userBill, int people, double tip){
        Bill = userBill;
        numberOfPeople = people;
        tipPercentage = tip;

    }


}
public class Main {

    public static void main(String[] args){
        // Grabbing user input values
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bill: ");

        double bill = scan.nextDouble();
        System.out.print("\nTip Percent (whole number): ");

        double tipPercent = scan.nextDouble();
        System.out.print("\nNumber of People: ");

        int numberOfPeople = scan.nextInt();

        // Initializing Table Class
        Table myTable = new Table(bill, numberOfPeople, tipPercent);

        // Initializing Cash Register Class
        cashRegister cas = new cashRegister(myTable.Bill, myTable.tipPercentage, myTable.numberOfPeople);

        // Printing the Receipt
        cas.printReceipt();

    }
}
