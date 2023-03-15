package AbstractFactory.Factories;

import AbstractFactory.Workers.*;

public class BankTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Manager getManager() {
        return new BankManager();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
