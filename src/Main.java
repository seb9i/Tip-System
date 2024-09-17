import java.util.Scanner;

class cashRegister {
    private final double tipAmount;
    public double bill;
    public int numberofPeople;
    public double tipPercentage;
    private final double finalBill;
    private final double tipPerPerson;
    private final double finalPerPerson;

    public cashRegister(double userBill, double usertipPercentage, int usernumberofPeople) {
        bill = userBill;
        tipPercentage = usertipPercentage / 100;
        numberofPeople = usernumberofPeople;



        tipAmount = tipPercentage * bill;
        finalBill = tipAmount + bill;

        tipPerPerson = tipAmount / numberofPeople;
        finalPerPerson = finalBill / numberofPeople;



    }

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

class Table {
    public int numberOfPeople;
    public double Bill;
    public double tipPercentage;

    public Table(double userBill, int people, double tip){
        Bill = userBill;
        numberOfPeople = people;
        tipPercentage = tip;

    }


}
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your bill: ");
        double bill = scan.nextDouble();
        System.out.print("\nTip Percent (whole number): ");
        double tipPercent = scan.nextDouble();
        System.out.print("\nNumber of People: ");
        int numberOfPeople = scan.nextInt();


        Table myTable = new Table(bill, numberOfPeople, tipPercent);

        cashRegister cas = new cashRegister(myTable.Bill, myTable.tipPercentage, myTable.numberOfPeople);

        cas.printReceipt();

    }
}
