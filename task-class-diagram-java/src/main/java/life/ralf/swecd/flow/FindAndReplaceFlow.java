package life.ralf.swecd.flow;

import life.ralf.swecd.flow.condition.Condition;

import java.util.regex.Pattern;

public class FindAndReplaceFlow extends Flow {

    public final Pattern what;
    public final String with;
    public final String[] targets;

    public FindAndReplaceFlow(
            String id,
            String name,
            Condition<?> condition,
            Pattern what,
            String with,
            String[] targets
    ) {
        super(id, name, condition);
        this.what = what;
        this.with = with;
        this.targets = targets;
    }

    @Override
    public void apply(Event event) throws Exception {
        // TODO: Implement this
    }

}
