package life.ralf.swecd.flow;

import java.util.Date;
import java.util.Map;

public record Event(
        Date dateFrom,
        Date dateTo,
        String name,
        String room,
        Map<String, Object> attributes
) {

}
