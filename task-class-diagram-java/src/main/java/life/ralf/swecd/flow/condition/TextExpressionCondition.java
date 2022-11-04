package life.ralf.swecd.flow.condition;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TextExpressionCondition extends Condition<String> {

    public final String expression;

    @Override
    public boolean check(String value, Context context) {
        return false;
    }

}
