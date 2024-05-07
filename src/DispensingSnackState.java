// Concrete DispensingSnackState class representing the dispensing snack state of the vending machine
class DispensingSnackState extends StateOfVendingMachine {
    public DispensingSnackState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    void selectSnack(String snackName) {
        System.out.println("Already dispensing a snack.");
    }

    @Override
    void insertMoney(double amount) {
        System.out.println("Already dispensing a snack.");
    }

    @Override
    void dispenseSnack() {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        if (selectedSnack.quantity > 0) {
            System.out.println("Dispensing " + selectedSnack.name);
            selectedSnack.quantity--;
            System.out.println("Change: " + (vendingMachine.moneyInserted - selectedSnack.price));
            vendingMachine.setCurrentState(new IdleState(vendingMachine));
        } else {
            System.out.println("Out of " + selectedSnack.name);
            vendingMachine.setCurrentState(new IdleState(vendingMachine));
            System.out.println("Returning money: " + vendingMachine.moneyInserted);
        }
    }
}
