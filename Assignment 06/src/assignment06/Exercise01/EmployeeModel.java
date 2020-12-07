package assignment06.Exercise01;
import java.util.Random;
public class EmployeeModel {

    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String IDNumber;



    protected EmployeeModel(String name, String surname, String address, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.IDNumber = randomAlphanumeric(8);
    }

    public String getNewAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String addNewAddress(String Address){
        return Address;
    }
    public String addNewNumber(String Number){
        return Number;
    }

    private final String Letters = "abcdefghijklmnopqrstuvwxyz";
    private final char[] Alphanumeric = (Letters + Letters.toUpperCase() + "0123456789").toCharArray();

    public String randomAlphanumeric(int length) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<length; i++){
            result.append(Alphanumeric[new Random().nextInt(Alphanumeric.length)]);
        }
        return result.toString();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIDNumber() {
        return IDNumber;
    }


}
