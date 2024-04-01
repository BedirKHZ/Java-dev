public class Main {
    public static void main(String[] args) {
        // Car sınıfından bir nesne oluşturma
        Car car = new Car("Opel", "Mokka", 2023, 4);
        System.out.println("Car:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumDoors());
        car.start();
        car.stop();
        System.out.println();

        // Motorcycle sınıfından bir nesne oluşturma
        Motorcycle motorcycle = new Motorcycle("Yuki", "C5 ZR250", 2023, true);
        System.out.println("Motorcycle:");
        System.out.println("Brand: " + motorcycle.getBrand());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Has Sidecar: " + motorcycle.isHasSidecar());
        motorcycle.start();
        motorcycle.stop();
        System.out.println();

        // Truck sınıfından bir nesne oluşturma
        Truck truck = new Truck("BMC", "MBk-10", 2023, 3.5);
        System.out.println("Truck:");
        System.out.println("Brand: " + truck.getBrand());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
        truck.start();
        truck.stop();
    }
}
