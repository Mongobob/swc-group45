package assignment05.Exercise02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * the customer is the main class, it combines all the cars and can choose one of them
 * when the date is given we can see as an output which abilities the car has
 *
 * @return car type and his details given the departure date
 * @version 1.0
 * @since 27.11.2020
 */


public class Customer {

    private Date departureDay;
    private Vehicles vehicle;

    public Customer(Vehicles vehicle, String date){

        // Generate a date in case the input is incorrect and then assign the departure day
        Date d = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");

        try{
            d = DateFor.parse(date); // the String for the departure day must have the form dd/MM/yyyy ,ex. 13/07/1983
        } catch (ParseException e) { // ... otherwise the departure day is just going to be today's date.
            // e.printStackTrace(); // uncomment for debugging
        }

        departureDay = d;

        this.vehicle = vehicle;
    }

    public String ride(){
        return vehicle.CarType() + vehicle.Luggage() + vehicle.Speed() + vehicle.Cost();
    }

    public String getDepartureDay() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        String value = DateFor.format(departureDay);
        return value;
    }

    public static void main(String[] args) {

        MicroCar a = new MicroCar();

        System.out.println(a.CarType() + a.Luggage()+ a.Speed()+a.Cost());


        SuperCar c = new SuperCar();
        System.out.println(c.CarType() + c.Luggage()+ c.Speed()+c.Cost());


        // now it should work with the customer when he chooses the date and the car type
        Bus bus = new Bus();
        Customer b = new Customer(bus,"31/12/2020");
        System.out.println(b.ride());

    }

}


