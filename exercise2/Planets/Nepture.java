package Planets;

import Explorers.Explorer;

public class Nepture implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
