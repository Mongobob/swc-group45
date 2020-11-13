package assignment04;

import java.util.ArrayList;

public class NoBankEmployeesException extends Exception {

    public NoBankEmployeesException() {
        // empty
    }

    public String toString() {
        return "Exception: Action can not be made without BankEmployees.";
    }

    public static void hasBankStaff() throws NoBankEmployeesException{
        int totalStaffMember = 0;

        for(int i = 0; i < Archive.getInstance().amountEmployee(); i++){
            if(Archive.getInstance().getEmployee(i) != null && Archive.getInstance().getEmployee(i) instanceof BankEmployee){
                totalStaffMember++;
            }
        }

        if(totalStaffMember == 0) {
            throw new NoBankEmployeesException();
        }
    }

}
