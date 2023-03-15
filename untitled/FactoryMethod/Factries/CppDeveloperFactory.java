package FactoryMethod.Factries;

import FactoryMethod.Developers.CppDeveloper;
import FactoryMethod.Developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
