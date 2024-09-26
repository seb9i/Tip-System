class CashRegister {
    // Initializing variables that are part of the final receipt
    private final double tipAmount;
    public double bill;
    public int numberOfPeople;
    public double tipPercentage;
    private final double finalBill;
    private final double tipPerPerson;
    private final double finalPerPerson;

    // Class constructor that accepts the bill, tip percentage, and the number of people
    public CashRegister(double userBill, double usertipPercentage, int usernumberofPeople) {

        // Calculations
        bill = userBill;
        tipPercentage = usertipPercentage / 100;
        numberOfPeople = usernumberofPeople;

        tipAmount = tipPercentage * bill;
        finalBill = tipAmount + bill;

        tipPerPerson = tipAmount / numberOfPeople;
        finalPerPerson = finalBill / numberOfPeople;

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
                            Total Tip Amount: $%.2f
                            Total Bill Cost: $%.2f
                            Tip Per Person: $%.2f
                            Final Bill Per Person: $%.2f""", getTipAmount(), getFinalBill(), getTipPerPerson(), getFinalPerPerson());
    }

}