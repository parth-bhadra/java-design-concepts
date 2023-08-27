package dependencyInversionPrinciple;

public class Mahindra extends Vehicle {
    public Mahindra(int speed, int engineSize, int numberOfDoors) {
        super(speed, engineSize, numberOfDoors);
    }

    @Override
    public void startEngine() {
        System.out.println("Mahindra's engine starting");
    }

    @Override
    public void startMedia() {
        System.out.println("Starting Mahindra's media");
    }

    @Override
    public void startAC() {
        System.out.println("Starting Mahindra's AC");
    }
}
