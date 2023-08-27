package dependencyInversionPrinciple;

public class Tata extends Vehicle {

    public Tata(int speed, int engineSize, int numberOfDoors) {
        super(speed, engineSize, numberOfDoors);
    }

    @Override
    public void startEngine() {
        System.out.println("Tata's engine starting");
    }

    @Override
    public void startMedia() {
        System.out.println("Starting Tata's media");
    }

    @Override
    public void startAC() {
        System.out.println("Starting Tata's AC");
    }



}
