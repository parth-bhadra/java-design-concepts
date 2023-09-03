package PrototypeAndRegistry;

public class Kia implements Car {
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    public Kia(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    public Kia(Kia m) {
        this(m.modelName, m.engineSize, m.noOfWheels, m.serialNumber);
    }
}
