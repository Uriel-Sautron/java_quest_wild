package dom.quest7;

public class Hangar {

    public static void main(String[] args) {
        Car car = new Car("Audi", 50000);
        Boat boat = new Boat("Yamaha", 10000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
