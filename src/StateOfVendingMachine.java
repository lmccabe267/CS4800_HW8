// Abstract State class representing the different states of the vending machine
abstract class StateOfVendingMachine {
    protected VendingMachine vendingMachine;

    public StateOfVendingMachine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    abstract void selectSnack(String snackName);
    abstract void insertMoney(double amount);
    abstract void dispenseSnack();
}
