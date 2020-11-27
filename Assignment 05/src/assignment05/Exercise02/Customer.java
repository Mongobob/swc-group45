package assignment05.Exercise02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

    public enum VehicleType {MicroCar, FamilyCar, Supercar, Bus};

    private Date departureDay;
    private Vehicles transport;

    public Customer(VehicleType vehicle, String date){

        // Generate a date in case the input is incorrect and then assign the departure day
        Date d = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");

        try{
            d = DateFor.parse(date); // the String for the departure day must have the form dd/MM/yyyy ,ex. 13/07/1983
        } catch (ParseException e) { // ... otherwise the departure day is just going to be today's date.
            // e.printStackTrace(); // uncomment for debugging
        }

        departureDay = d;

        // depending on car type set the vehicle
        switch (vehicle) {
            case MicroCar  -> transport = new MicroCar();
            case FamilyCar -> transport = new FamilyCar();
            case Supercar  -> transport = new SuperCar();
            case Bus       -> transport = new Bus();
        }
    }

    public String ride(){
        return transport.CarType() + transport.Luggage() + transport.Speed() + transport.Cost();
    }

    public String getDepartureDay() {
        return departureDay.toString();
    }

    public static void main(String[] args) {

        // just test if it works without customer
        MicroCar a = new MicroCar();

        System.out.println(a.CarType() + a.Luggage()+ a.Speed()+a.Cost());

        SuperCar c = new SuperCar();
        System.out.println(c.CarType() + c.Luggage()+ c.Speed()+c.Cost());


        // now it should work with the customer when he chooses the date and the car type

        Customer b = new Customer(VehicleType.Bus,"31/12/2020");
        System.out.println(b.ride());

    }

}


