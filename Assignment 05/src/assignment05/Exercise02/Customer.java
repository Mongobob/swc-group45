package assignment05.Exercise02;

public class Customer {

    public static void main(String[] args) {

        MicroCar a = new MicroCar();

        System.out.println(a.CarType() + a.Luggage()+ a.Speed()+a.Cost());

        SuperCar c = new SuperCar();
        System.out.println(c.CarType() + c.Luggage()+ c.Speed()+c.Cost());


    }
}
