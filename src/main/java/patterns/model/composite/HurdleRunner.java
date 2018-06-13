package patterns.model.composite;

import patterns.iface.composite.Runner;

public class HurdleRunner implements Runner {
    @Override
    public void running(String team) {
        System.out.println("HurdleRunner is running for team " + team);
    }
}
