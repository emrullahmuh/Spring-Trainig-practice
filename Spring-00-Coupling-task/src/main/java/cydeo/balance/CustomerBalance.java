package cydeo.balance;

import java.math.BigDecimal;
import java.util.UUID;

public class CustomerBalance extends Balance{
    public CustomerBalance(UUID customerid, BigDecimal balance) {
        super(customerid, balance);
    }

    @Override
    public BigDecimal addBalance(BigDecimal amount) {
       setBalance(getBalance().add(amount));



        return getBalance();
    }
}
