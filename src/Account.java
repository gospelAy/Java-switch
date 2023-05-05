import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;
    private final String pin;
    private int accountNumber;
    private String accountName;

    public Account(String pin, int accountNumber, String accountName) {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

}
