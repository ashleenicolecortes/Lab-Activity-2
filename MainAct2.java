public class Main {

    public static void main(String[] args) {

      
        Vehicle vehicle1 = new Vehicle("Ford", "Mustang", 1967);
        Vehicle vehicle2 = new Vehicle("Toyota", "Civic", 2020);
        Vehicle vehicle3 = new Vehicle("Chevrolet", "Corvette", 1998);

       
        System.out.println(" VEHICLE 1 ");
        vehicle1.displayInfo();
        System.out.println(" Age: " + vehicle1.calculateAge() + " years");
        System.out.println(" Is Vintage? " + vehicle1.isVintage());
        System.out.println();

        System.out.println(" VEHICLE 2 ");
        vehicle2.displayInfo();
        System.out.println(" Age: " + vehicle2.calculateAge() + " years");
        System.out.println(" Is Vintage? " + vehicle2.isVintage());
        System.out.println();

        System.out.println(" VEHICLE 3 ");
        vehicle3.displayInfo();
        System.out.println(" Age: " + vehicle3.calculateAge() + " years");
        System.out.println(" Is Vintage? " + vehicle3.isVintage());
        System.out.println();

       
        System.out.println("=== Demonstrating Getters (Vehicle 1) ===");
        System.out.println("Brand: " + vehicle1.getBrand());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Year: " + vehicle1.getYear());
        System.out.println();

       
        System.out.println("=== Testing setYear() Behavior ===");
        
       
        boolean result1 = vehicle1.setYear(2000);
        System.out.println("setYear(2000) return value: " + result1);
        System.out.println("Stored Year: " + vehicle1.getYear() + "; Age: " + vehicle1.calculateAge() + "; Vintage: " + vehicle1.isVintage());
        System.out.println();

        
        boolean result2 = vehicle1.setYear(1885);
        System.out.println("setYear(1885) return value: " + result2);
        System.out.println("Stored Year: " + vehicle1.getYear());
        System.out.println();


        boolean result3 = vehicle1.setYear(2027);
        System.out.println("setYear(2027) return value: " + result3);
        System.out.println("Stored Year: " + vehicle1.getYear());
        System.out.println();

       
        System.out.println("=== Testing Constructor Invalid Year Rules ===");
        
        
        Vehicle testVehicle1 = new Vehicle("TestBrand", "TestModel", 1885);
        System.out.println("New vehicle created with year 1885 -> Initial year stored: " + testVehicle1.getYear());

        
        Vehicle testVehicle2 = new Vehicle("TestBrand", "TestModel", 2027);
        System.out.println("New vehicle created with year 2027 -> Initial year stored: " + testVehicle2.getYear());
    }
}