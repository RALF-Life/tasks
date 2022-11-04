package life.ralf.swecd.flow;

import life.ralf.swecd.flow.condition.Condition;
import lombok.RequiredArgsConstructor;

import java.util.regex.Pattern;

public class FilterOutByRegExFlow extends FilterOutByFlow {

    public final Pattern what;

    public FilterOutByRegExFlow(
            String id,
            String name,
            Condition<?> condition,
            Pattern what
    ) {
        super(id, name, condition);
        this.what = what;
    }

    @Override
    public void apply(Event event) throws Exception {

    }

}
