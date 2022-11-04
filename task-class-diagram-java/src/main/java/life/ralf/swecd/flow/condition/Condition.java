package life.ralf.swecd.flow.condition;

public abstract class Condition<L> {

    public abstract boolean check(L value, Context context);

}
