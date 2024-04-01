class Car extends Vehicle {//vehicle sınıfından miras alır.
    private int numDoors;

    //Burdada aynı şekilde yapıcı metod kullandım car sınıfından bir nesne
    // oluştururken kullanılır nesneye başlangıç değeri atar
    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    // Start metodu Vehicle sınıfından override edilir
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    // Stop metodu Vehicle sınıfından override edilir
    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    // Getter ve setter metotlar
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }


}
