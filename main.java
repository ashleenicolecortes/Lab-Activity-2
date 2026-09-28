public class Main{
    public static void main(String[] args){

        Vehicles v1 = new Vehicles();
        v1.brand = "BMW";
        v1.model = "3 Series";
        v1.year = 2022;

        Vehicles v2 = new Vehicles();
        v2.brand = "Ford";
        v2.model = "Mustang";
        v2.year = 1995;
        
        Vehicles v3 = new Vehicles();
        v3.brand = "Honda";
        v3.model = "Civic";
        v3.year = 2020;

        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vinatage: " + v1.isVintage());
        System.out.println();

        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vinatage: " + v2.isVintage());
        System.out.println();


        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vinatage: " + v3.isVintage());
        System.out.println();
    }
}