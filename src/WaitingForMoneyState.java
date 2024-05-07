class WaitingForMoneyState extends StateOfVendingMachine {
    public WaitingForMoneyState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    void selectSnack(String snackName) {
        System.out.println("Please insert money or cancel the selection.");
    }

    @Override
    void insertMoney(double amount) {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        if (selectedSnack.price <= amount) {
            System.out.println("Money inserted: " + amount);
            vendingMachine.setCurrentState(new DispensingSnackState(vendingMachine));
        } else {
            System.out.println("Not enough money inserted.");
        }
    }

    @Override
    void dispenseSnack() {
        System.out.println("Please insert money first.");
    }
}
