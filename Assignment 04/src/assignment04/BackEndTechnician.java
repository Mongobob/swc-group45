package assignment04;

public class BackEndTechnician {


    private final String Name;
    private final String Surname;
    private final int IDNumber;

    public BackEndTechnician(String Name, String Surname, EmployeeCounter IDNumber){
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

    String fixBackEnd(int IDNumber){
        System.out.println("fixed");
        return "fixed";
    }
}
