import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AccountBean {
    private double balance;
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public double getBalance() { return balance; }

    public void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative.");
        double oldBalance = this.balance;
        this.balance = balance;
        support.firePropertyChange("balance", oldBalance, balance);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
