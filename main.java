
public class Main {

    public static void main(String[] args) {

        
        Vehicles v1 = new Vehicles("BMW", "3 Series", 2022);
        Vehicles v2 = new Vehicles("Ford", "Mustang", 1995);
        Vehicles v3 = new Vehicles("Honda", "Civic", 2020);

        
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vintage: " + v1.isVintage());
        System.out.println();

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vintage: " + v2.isVintage());
        System.out.println();

        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vintage: " + v3.isVintage());
        System.out.println();

        
        System.out.println("=== Demonstrating Getters (v1) ===");
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println();

        
        System.out.println("=== Testing setYear() Behavior ===");

        boolean res1 = v1.setYear(2000);
        System.out.println("setYear(2000) return value: " + res1);
        System.out.println("Stored Year: " + v1.getYear() + "; Age: " + v1.calculateAge() + "; Vintage: " + v1.isVintage());
        System.out.println();

        boolean res2 = v1.setYear(1885);
        System.out.println("setYear(1885) return value: " + res2);
        System.out.println("Stored Year: " + v1.getYear());
        System.out.println();

        boolean res3 = v1.setYear(2027);
        System.out.println("setYear(2027) return value: " + res3);
        System.out.println("Stored Year: " + v1.getYear());
        System.out.println();

        
        System.out.println("=== Testing Constructor Invalid Year Rules ===");

        Vehicles testV1 = new Vehicles("TestBrand", "TestModel", 1885);
        System.out.println("New vehicle created with year 1885 -> Initial year stored: " + testV1.getYear());

        Vehicles testV2 = new Vehicles("TestBrand", "TestModel", 2027);
        System.out.println("New vehicle created with year 2027 -> Initial year stored: " + testV2.getYear());
    }
}