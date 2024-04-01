class Vehicle {

    //brand =Aracın markası ,model =Aracın modeli ,year =Aracın yılı
    private String brand;
    private String model;
    private int year;


    //Yapıcı metod kullandım başlangıç değerlerini atmak için
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Aracı çalıştırma metodudur,ekrana tırnak işaretinin içini yazdırır.
    public void start() {
        System.out.println("Vehicle is starting");
    }
    //Aracı durdurma metodudur,ekrana tırnak işaretinin içini yazdırır.
    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    // Getter ve setter metotları
    //Getter metodu aracın markasını çağırır Setter metodu ise aracın markasını belirtir
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}