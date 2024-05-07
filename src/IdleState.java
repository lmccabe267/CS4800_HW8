class IdleState extends StateOfVendingMachine {
    public IdleState(VendingMachine vendingMachine) {
        super(vendingMachine);
    }

    @Override
    void selectSnack(String snackName) {
        System.out.println("Snack selected: " + snackName);
        vendingMachine.setCurrentState(new WaitingForMoneyState(vendingMachine));
    }

    @Override
    void insertMoney(double amount) {
        System.out.println("Select a snack first.");
    }

    @Override
    void dispenseSnack() {
        System.out.println("Select a snack first.");
    }
}
