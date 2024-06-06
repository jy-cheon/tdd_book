package chap03.first;

import java.time.LocalDate;

public class ExpiryDateCalculator {

//    public LocalDate calExpiryDate(LocalDate billingDate, int payAmount) {
//        return LocalDate.of(2019, 4, 1);
//    }

    public LocalDate calExpiryDate(LocalDate billingDate, int payAmount) {
        return billingDate.plusMonths(1);
    }
}
