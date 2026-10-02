
public class Vehicles {
    
    private String brand;
    private String model;
    private int year;

    
    public Vehicles(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026; // Default value if invalid
        }
    }

    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    
    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }
        return false;
    }

    
    public void displayInfo() {
        System.out.println(brand + " " + model + " (" + year + ")");
    }

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}