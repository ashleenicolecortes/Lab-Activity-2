
public class Main {
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        // DEMO 1: A parent reference can refer to a child object.
        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Ford", "Mustang", 1967, 4);
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        // The same variable now refers to a Motorcycle object.
        vehicle = new Motorcycle("Honda", "Click 125i", 2023, "125cc Single-Cylinder");
        vehicle.displayInfo();
        vehicle.moveForward();
        vehicle.moveBackward();
        vehicle.moveLeft();
        vehicle.moveRight();
        System.out.println();

        // DEMO 2: One method accepts different Vehicle subclasses.
        System.out.println("\n=== 2. Method Parameter ===");

        Car car = new Car("Mitsubishi", "Mirage G4", 2021, 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "NMAX 155", 2024, "155cc Single-Cylinder");
        Truck truck = new Truck("Isuzu", "Elf", 2020, 6);

        printDetails(car);
        car.moveForward();
        car.moveBackward();
        car.moveLeft();
        car.moveRight();
        System.out.println();
        printDetails(motorcycle);
        motorcycle.moveForward();
        motorcycle.moveBackward();
        motorcycle.moveLeft();
        motorcycle.moveRight();
        System.out.println();
        printDetails(truck);
        truck.moveForward();
        truck.moveBackward();
        truck.moveLeft();
        truck.moveRight();
        System.out.print("");

        // DEMO 3: One array holds different Vehicle subclasses.
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
                new Car("Honda", "City", 2022, 4),
                new Motorcycle("Honda", "TMX 125", 2021, "125cc Single-Cylinder"),
                new Truck("Mitsubishi", "Canter", 2020, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            currentVehicle.moveForward();
            currentVehicle.moveBackward();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
    }
}