public class Main{
    public static void main(String[] args){

        Vehicles v1 = new Vehicles("BMW", "3 Series", 2022);

        Vehicles v2 = new Vehicles("Ford", "Mustang", 1995);
        
        Vehicles v3 = new Vehicles("Honda", "Civic", 2020);

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