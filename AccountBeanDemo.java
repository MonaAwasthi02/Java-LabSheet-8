public class AccountBeanDemo {
    public static void main(String[] args) {
        AccountBean account = new AccountBean();

        account.addPropertyChangeListener(event ->
            System.out.println("Property '" + event.getPropertyName()
                    + "' changed from " + event.getOldValue()
                    + " to " + event.getNewValue())
        );

        account.setBalance(1000);
        account.setBalance(1500);
    }
}
