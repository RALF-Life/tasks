package life.ralf.swecd;

import life.ralf.swecd.flow.Flow;
import life.ralf.swecd.source.ICSSource;

import java.util.Set;

public record FilterProfile(
        int id,
        String name,
        Set<Flow> flows,
        ICSSource source
) {

}
