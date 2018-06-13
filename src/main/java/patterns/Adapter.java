package patterns;

import patterns.model.adapter.FrenchPerson;
import patterns.model.adapter.NormalPerson;

public class Adapter extends NormalPerson {

    public String getName(FrenchPerson frenchPerson) {
        return frenchPerson.getNom();
    }

    public void setName(FrenchPerson frenchPerson) {
        super.setName(frenchPerson.getNom());
    }
}
