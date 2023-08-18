package cydeo.balance;

import java.math.BigDecimal;
import java.util.UUID;

public class GiftcartBalance extends Balance{

    public GiftcartBalance(UUID customerid, BigDecimal balance) {
        super(customerid, balance);
    }

    @Override
    public BigDecimal addBalance(BigDecimal amount) {
        setBalance(getBalance().add(amount));

        return getBalance() ;
    }
}
