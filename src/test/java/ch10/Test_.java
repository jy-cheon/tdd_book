package ch10;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_ {

    @Test
    void check() {
        Calendar calendar = BDDMockito.mock(Calendar.class);


        BDDMockito.given(calendar.getFirstDayOfWeek()).willReturn(1);

        assertEquals(1, calendar.getTime().toString());


    }


}
