package assignment06.Exercise01;

import java.util.ArrayList;

public class Archive {

    ArrayList<EmployeeModel> listEmp = new ArrayList<>();

    Archive Data;

    private Archive(){
        Data = this;
    }

    public Archive getInstance(){
        if (Data == null){
            return Data;
        }
        else return this;
    }

}
