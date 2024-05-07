// Driver class to test the vending machine
public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addSnack(new Snack("Coke", 1.5, 5));
        vendingMachine.addSnack(new Snack("Pepsi", 1.75, 4));
        vendingMachine.addSnack(new Snack("Cheetos", 1.25, 3));
        vendingMachine.addSnack(new Snack("Doritos", 1.4, 2));
        vendingMachine.addSnack(new Snack("KitKat", 1.1, 1));
        vendingMachine.addSnack(new Snack("Snickers", 1.2, 0));


        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.5);
        vendingMachine.dispenseSnack();
    }
}
