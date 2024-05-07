import java.util.HashMap;

// Chain of Responsibility: SnackDispenserHandler class
class SnackDispenserHandler {
    private HashMap<String, Snack> snacks = new HashMap<>();
    private SnackDispenserHandler nextHandler;

    public void addSnack(Snack snack) {
        snacks.put(snack.name, snack);
    }

    public void setNextHandler(SnackDispenserHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Snack handleRequest(String snackName) {
        if (snacks.containsKey(snackName)) {
            Snack snack = snacks.get(snackName);
            if (snack.quantity > 0)
                return snack;
        }
        if (nextHandler != null)
            return nextHandler.handleRequest(snackName);
        return null;
    }
}
