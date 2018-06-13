package patterns.model.composite;

import patterns.iface.composite.Runner;

public class SprintRunner implements Runner {

    @Override
    public void running(String team) {
        System.out.println("Sprint Runner is running for team " + team);
    }
}
