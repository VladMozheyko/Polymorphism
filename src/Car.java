public class Car {
    int price;
    double speed;
    String brand;
    String color;

    public Car() {

    }

    public Car(int price, double speed, String brand) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
    }

    public Car(int price, double speed, String brand, String color) {
        this.price = price;
        this.speed = speed;
        this.brand = brand;
        this.color = color;
    }
}
