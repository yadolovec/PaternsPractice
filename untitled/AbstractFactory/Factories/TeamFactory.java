package AbstractFactory.Factories;

import AbstractFactory.Workers.Developer;
import AbstractFactory.Workers.Manager;
import AbstractFactory.Workers.Tester;

public interface TeamFactory {
    Developer getDeveloper();
    Manager getManager();
    Tester getTester();
}
