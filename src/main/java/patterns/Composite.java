package patterns;

import java.util.ArrayList;
import java.util.List;

import patterns.iface.composite.Runner;

public class Composite implements Runner {

    List<Runner> runners = new ArrayList<Runner>();

    public boolean add(Runner e) {
        return runners.add(e);
    }

    public boolean remove(Object o) {
        return runners.remove(o);
    }

    @Override
    public void running(String team) {
        runners.stream().forEach(runner -> runner.running(team));
    }
}
