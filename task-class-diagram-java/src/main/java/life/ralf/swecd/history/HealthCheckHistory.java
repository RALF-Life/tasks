package life.ralf.swecd.history;

import java.util.Date;

public final class HealthCheckHistory extends DiffHistory {

    public final String service;
    public final Date downFrom;
    public final Date downTo;

    public HealthCheckHistory(
            int id,
            String service,
            Date downFrom,
            Date downTo
    ) {
        super(id);
        this.service = service;
        this.downFrom = downFrom;
        this.downTo = downTo;
    }

    @Override
    public String diff() {
        // TODO: Implement this
        return null;
    }

}
