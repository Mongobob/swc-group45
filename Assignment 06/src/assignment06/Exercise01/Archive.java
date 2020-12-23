package assignment06.Exercise01;

import java.util.ArrayList;

public class Archive {

    ArrayList<EmployeeModel> listEmp = new ArrayList<>();

    static Archive Data;

    private Archive(){
        Data = this;
    }

    public static Archive getInstance(){
        if (Data == null){
            return Data;
        }
        else return new Archive();
    }

}
