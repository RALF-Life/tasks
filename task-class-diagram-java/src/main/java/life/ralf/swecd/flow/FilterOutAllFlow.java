package life.ralf.swecd.flow;

import life.ralf.swecd.flow.condition.Condition;

public class FilterOutAllFlow extends FilterOutByFlow {

    public FilterOutAllFlow(String id, String name, Condition<?> condition) {
        super(id, name, condition);
    }

    @Override
    public void apply(Event event) throws Exception {

    }

}
