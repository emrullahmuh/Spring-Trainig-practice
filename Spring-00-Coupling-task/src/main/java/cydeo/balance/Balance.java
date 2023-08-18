package cydeo.balance;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Balance {
    private UUID customerid;
    private BigDecimal balance;

    public Balance(UUID customerid, BigDecimal balance) {
        this.customerid = customerid;
        this.balance = balance;
    }

    public UUID getCustomerid() {
        return customerid;
    }

    public void setCustomerid(UUID customerid) {
        this.customerid = customerid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "customerid=" + customerid +
                ", balance=" + balance +
                '}';
    }

    public abstract BigDecimal addBalance(BigDecimal amount);
}
