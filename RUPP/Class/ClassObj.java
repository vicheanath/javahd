class Vehicles{
    int passengers;
    int fuelcap;
    int mpg;
    void rang(){
        System.out.println("Rang is "+ (fuelcap * mpg));
    }
}
class ClassObj{
    public static void main(String[] args) {
        Vehicles car1 = new Vehicles();

        car1.passengers =24;
        car1.fuelcap = 400;
        car1.mpg = 130;

        System.out.println("Car 1 passengers = "+ car1.passengers);
        System.out.println("Car 1 fuelcap = "+ car1.fuelcap);
        System.out.println("Car 1 mpg = "+ car1.mpg);
        Vehicles car2 = car1;
        System.out.println("Car 1 passengers = "+ car2.passengers);
        System.out.println("Car 1 fuelcap = "+ car2.fuelcap);
        System.out.println("Car 1 mpg = "+ car2.mpg);

        car2.rang();
        // System.out.println("Fuel needed = "+ car2.)
    }
}
