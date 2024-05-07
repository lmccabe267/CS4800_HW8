public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addSnack(new Snack("Coke", 1.5, 5));
        vendingMachine.addSnack(new Snack("Pepsi", 1.75, 4));
        vendingMachine.addSnack(new Snack("Cheetos", 1.25, 3));
        vendingMachine.addSnack(new Snack("Doritos", 1.4, 2));
        vendingMachine.addSnack(new Snack("KitKat", 1.1, 1));
        vendingMachine.addSnack(new Snack("Snickers", 1.2, 1));


        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();

        System.out.println("\n");

        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();

        System.out.println("\n");

        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(1.5);
        vendingMachine.dispenseSnack();

        System.out.println("\n");

        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();

        System.out.println("\n");

        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(1.2);
        vendingMachine.dispenseSnack();

        System.out.println("\n");

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.5);
        vendingMachine.dispenseSnack();

        System.out.println("\n");

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.5);
        vendingMachine.dispenseSnack();
    }
}
