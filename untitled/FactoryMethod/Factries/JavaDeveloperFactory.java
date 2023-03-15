package FactoryMethod.Factries;

import FactoryMethod.Developers.Developer;
import FactoryMethod.Developers.JavaDeveloper;
import FactoryMethod.Factries.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
