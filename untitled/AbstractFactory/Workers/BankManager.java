package AbstractFactory.Workers;

public class BankManager implements Manager{
    @Override
    public void manageProject() {
        System.out.println("Manager control everything...");
    }
}
