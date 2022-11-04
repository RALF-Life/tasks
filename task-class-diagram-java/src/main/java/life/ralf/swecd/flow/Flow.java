package life.ralf.swecd.flow;

import life.ralf.swecd.flow.condition.Condition;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Flow {

    public final String id;
    public final String name;
    public final Condition<?> condition;

    public abstract void apply(final Event event) throws Exception;

}
