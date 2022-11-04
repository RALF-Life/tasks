package life.ralf.swecd.history;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class DiffHistory {

    public final int id;

    public abstract String diff();

}
