package life.ralf.swecd.flow;

import life.ralf.swecd.flow.condition.Condition;

public abstract class FilterOutByFlow extends Flow {

    public FilterOutByFlow(String id, String name, Condition<?> condition) {
        super(id, name, condition);
    }

}
