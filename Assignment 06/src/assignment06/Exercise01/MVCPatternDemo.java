package assignment06.Exercise01;

import javax.swing.*;

public class MVCPatternDemo {

    public static void main(String[] args) {

        EmployeeViewer theView = new EmployeeViewer();
        EmployeeModel theModel = new EmployeeModel("Josip","Harambasic","Eiche","078");
        EmployeeController theController = new EmployeeController(theView,theModel);
        theView.setVisible(true);
    }

}