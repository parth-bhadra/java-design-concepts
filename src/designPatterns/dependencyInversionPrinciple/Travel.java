package src.designPatterns.dependencyInversionPrinciple;

public class Travel {
    Vehicle v;
    public Travel(Vehicle v) {
        this.v = v;
    }

    public void startTravelling() {
        System.out.println("Yay! We are about to begin");
        v.startEngine();
        v.startAC();
        v.startMedia();
    }
}
