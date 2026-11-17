import java.time.LocalDate;

public class DateBean {
    // Read-only JavaBean property: getter is present, setter is intentionally absent.
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}
