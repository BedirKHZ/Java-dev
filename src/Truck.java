class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String brand, String model, int year, double cargoCapacity) {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Start metodu Vehicle sınıfından override edilir
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    // Stop metodu Vehicle sınıfından override edilir
    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    // Getter ve setter metotlar
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    }

