// VendingMachine class managing the states and interactions
class VendingMachine {
    private SnackDispenserHandler snackDispenser = new SnackDispenserHandler();
    private StateOfVendingMachine currentState;
    private Snack selectedSnack;
    double moneyInserted;

    public VendingMachine() {
        // Setting up the chain of responsibility
        snackDispenser.setNextHandler(new SnackDispenserHandler());

        // Initializing currentState to IdleState
        currentState = new IdleState(this);
    }

    public void addSnack(Snack snack){
        snackDispenser.addSnack(snack);
    }

    public void setCurrentState(StateOfVendingMachine currentState) {
        this.currentState = currentState;
    }

    public void selectSnack(String snackName) {
        selectedSnack = snackDispenser.handleRequest(snackName);
        if (selectedSnack != null)
            currentState.selectSnack(snackName);
        else
            System.out.println("Snack is not available.");
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }

    public void insertMoney(double amount) {
        moneyInserted += amount;
        currentState.insertMoney(amount);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack();
    }
}
