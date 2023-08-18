package cydeo;

import cydeo.balance.Balance;

import java.math.BigDecimal;

public class BalanceMnager {
    public static boolean checout(Balance balance, BigDecimal bigDecimal){
       BigDecimal amount=balance.getBalance();
        if (balance.getBalance().subtract(bigDecimal).compareTo(BigDecimal.ZERO)>0){
            balance.setBalance(amount.subtract(bigDecimal));
       return true;
        }
         return false;}
}
