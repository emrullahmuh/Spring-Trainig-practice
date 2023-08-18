package cydeo;

import cydeo.balance.Balance;
import cydeo.balance.CustomerBalance;
import cydeo.balance.GiftcartBalance;
import cydeo.BalanceMnager;
import java.math.BigDecimal;
import java.util.UUID;

public class main {


    public static void main(String[] args) {
        UUID userid=UUID.randomUUID();

        Balance customerBalance=new CustomerBalance(userid, BigDecimal.ZERO);
        Balance giftcartBalance=new GiftcartBalance(userid,BigDecimal.ZERO);

        customerBalance.addBalance(new BigDecimal(100));
        giftcartBalance.addBalance(new BigDecimal(130));

        System.out.println(customerBalance.getBalance());
        System.out.println(giftcartBalance.getBalance());
    boolean checkCustomerBalance=BalanceMnager.checout(customerBalance,new BigDecimal(140));
        boolean checkGiftcartBalance=BalanceMnager.checout(giftcartBalance,new BigDecimal(120));

        System.out.println("Customer Balance  "+checkCustomerBalance);
        System.out.println("Gift Cart Balance  "+checkGiftcartBalance);


    }
}
