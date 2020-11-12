package assignment04;

public class BackEndTechnician {


    private final String Name;
    private final String Surname;
    private final int IDNumber;

    public BackEndTechnician(String Name, String Surname, int IDNumber){
        this.Name = Name;
        this.Surname = Surname;
        this.IDNumber = IDNumber;
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

    void fixBackEnd(int IDNumber){
        System.out.println("fixed");
    }
}
