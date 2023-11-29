package src.oops.deepAndShallow;

public class Main {
    public static void main(String[] args) {
        Car seltosBlack = new Car("Seltos", "KIA", "Black");
//        System.out.println(seltosBlack.toString());
        Car seltosBlackCopy = new Car(seltosBlack);
//        System.out.println(seltosBlackCopy.toString());
        Car sonetBlack = seltosBlack;
        sonetBlack.name = "Sonet";

        System.out.println(sonetBlack.toString());
        System.out.println(seltosBlack.toString());
        System.out.println(seltosBlackCopy.toString());

    }
}

class Car {
    public String name;
    public String brand;
    public String color;
    public Car(String name, String brand, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public Car(Car car) {
        this.name = car.name;
        this.brand = car.brand;
        this.color = car.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}