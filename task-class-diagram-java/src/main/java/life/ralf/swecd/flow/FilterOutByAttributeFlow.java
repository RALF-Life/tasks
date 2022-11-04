package life.ralf.swecd.flow;

import life.ralf.swecd.flow.condition.Condition;

import java.util.regex.Pattern;

public class FilterOutByAttributeFlow extends FilterOutByFlow {

    public final Pattern what;
    public final Attribute attribute;

    public FilterOutByAttributeFlow(
            String id,
            String name,
            Condition<?> condition,
            Pattern what,
            Attribute attribute
    ) {
        super(id, name, condition);
        this.what = what;
        this.attribute = attribute;
    }

    @Override
    public void apply(Event event) throws Exception {

    }

}
