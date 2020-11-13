package assignment04;

public class EmployeeCounter {

    private static EmployeeCounter uniqueInstance;

    private int employeeID = 1;

    // instance variables coming here
    protected EmployeeCounter(){}

    public static EmployeeCounter getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new EmployeeCounter();
        }

        return uniqueInstance;
    }

    public int getEmployeeID() {
        return employeeID++;
    }

    public void resetID() {
        employeeID = 0;
    }

}
