package life.ralf.swecd.history;

public final class FilterProfileHistory extends DiffHistory {

    public final String path;
    public final Object old;
    public final Object _new;

    public FilterProfileHistory(
            int id,
            String path,
            Object old,
            Object _new
    ) {
        super(id);
        this.path = path;
        this.old = old;
        this._new = _new;
    }

    @Override
    public String diff() {
        // TODO: Implement this
        return null;
    }

}
