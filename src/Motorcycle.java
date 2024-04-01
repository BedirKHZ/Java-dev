class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    // Start metodu Vehicle sınıfından override edilir
    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    // Stop metodu Vehicle sınıfından override edilir
    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }

    // Getter ve setter metotlar
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }


}
