public class BalanceChangeDemo {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();

        account.addPropertyChangeListener(event ->
            System.out.println("Balance updated: " + event.getOldValue()
                    + " -> " + event.getNewValue())
        );

        System.out.println("Initial balance: " + account.getBalance());
        account.setBalance(2500); // Fires a property-change event.
        account.setBalance(4000);
    }
}
