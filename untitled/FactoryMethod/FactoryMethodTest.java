package FactoryMethod;

import FactoryMethod.Developers.Developer;
import FactoryMethod.Factries.CppDeveloperFactory;
import FactoryMethod.Factries.DeveloperFactory;
import FactoryMethod.Factries.JavaDeveloperFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        DeveloperFactory factory = developerFactoryBySpeciality("jAvA");
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory developerFactoryBySpeciality(String speciality){
        if (speciality.equalsIgnoreCase("cpp")||speciality.equalsIgnoreCase("c++")){
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }

        throw new RuntimeException("No such speciality as "+speciality);
    }
}
