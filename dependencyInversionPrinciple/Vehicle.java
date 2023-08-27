package dependencyInversionPrinciple;

interface iStartEngine {
    void startEngine();
}
interface iStartMedia {
    void startMedia();
}
interface iStartAC {
    void startAC();
}

public class Vehicle implements iStartEngine, iStartMedia, iStartAC {
    int speed;
    int engineSize;
    int numberOfDoors;

    public Vehicle(int speed, int engineSize, int numberOfDoors) {
        this.speed = speed;
        this.engineSize = engineSize;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting vehicle's engine");
    }
    @Override
    public void startMedia() {
        System.out.println("Starting vehicle's media");
    }
    @Override
    public void startAC() {
        System.out.println("Starting vehicle's AC");
    }
}
