package assignment04;

import java.util.concurrent.TimeUnit;

public class WebTechnician {

    private final String Name;
    private final String Surname;
    private final int IDNumber;

    public WebTechnician(String Name, String Surname, EmployeeCounter IDNumber){
        this.Name = Name;
        this.Surname = Surname;
        this.IDNumber = IDNumber.getEmployeeID();
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    String fixWebsite() throws InterruptedException {
        TimeUnit.SECONDS.sleep(30);{
            System.out.println("reparation complete");
        }
        return "reparation complete";
    }
}
