public class Test{
    // POINT OPF ENTRY METHOD 
    public static void main(String args[]) {
        // INSTANTIATING A NEW CAR
        Car tim_car = new Car();
        Car tim_car = new Car("Airbag", 4, true, "Grey");
        System.out.println(tim_car.getSuspension());

        tim_car.getAutomatic();
        tim_car.getColor();

        tim_car.setColor("Blue");

        System.out.println(tim_car.getColor());

    }
}