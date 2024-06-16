package second;

import java.time.LocalDate;

public class ExpiryDateCalculator {

    public LocalDate calExpiryDate(PayData payData) {
        int addedMonths = 1;
        if (payData.getFirstBillingDate() != null) {
            LocalDate candidateExp = payData.getBillingDate().plusMonths(addedMonths);
            if (payData.getFirstBillingDate().getDayOfMonth() !=
                    candidateExp.getDayOfMonth()) {
                return candidateExp.withDayOfMonth(payData.getFirstBillingDate().getDayOfMonth());
            }
        }
        return payData.getBillingDate().plusMonths(addedMonths);
    }

//    public LocalDate calExpiryDate(PayData payData) {
//        if (payData.getFirstBillingDate() != null) {
//            if (payData.getFirstBillingDate().equals(LocalDate.of(2019, 1, 31))) {
//                return LocalDate.of(2019, 3, 31);
//            }
//        }
//        return payData.getBillingDate().plusMonths(1);
//    }
}
