package AbstractFactory;

import AbstractFactory.Factories.BankTeamFactory;
import AbstractFactory.Factories.TeamFactory;
import AbstractFactory.Workers.Developer;
import AbstractFactory.Workers.Manager;
import AbstractFactory.Workers.Tester;

public class Test {
    public static void main(String[] args) {
        TeamFactory team = new BankTeamFactory();
        Developer developer = team.getDeveloper();
        Manager manager = team.getManager();
        Tester tester = team.getTester();

        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
