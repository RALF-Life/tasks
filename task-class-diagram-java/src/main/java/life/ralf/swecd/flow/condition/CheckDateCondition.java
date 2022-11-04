package life.ralf.swecd.flow.condition;

import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
public class CheckDateCondition extends Condition<Date> {

    public final Date dateFrom;
    public final Date dateTo;

    @Override
    public boolean check(Date value, Context context) {
        return false;
    }

}
