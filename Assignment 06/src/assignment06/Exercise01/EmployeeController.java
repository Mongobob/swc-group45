package assignment06.Exercise01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeController {
    private final EmployeeModel theModel;
    private final EmployeeViewer theView;
    private JButton Return = new JButton("return");
    private JButton next = new JButton();
    int State = 0;
    JFrame window = new JFrame("welcome Window");



    public void welcomeWindow(){
        JButton newEmployee = new JButton("new Employee");
        JButton viewEmployee = new JButton("view Employee");
        JPanel firstWindow = new JPanel();
        newEmployee.setBounds(10,80,80,25);
        firstWindow.setBounds(90,80,80,25);
        firstWindow.add(newEmployee);
        firstWindow.add(viewEmployee);
    }



    public EmployeeController(EmployeeViewer theView, EmployeeModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        //this.theView.addAddressListener(new AddressListener());
    }

    class AddressListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {

            String address, phoneNumber;

            try {
                address = theView.getaddress();
                phoneNumber = theView.getphoneNumber();
                theModel.addNewAddress(address);
                theModel.addNewNumber(phoneNumber);



                theView.setAddress(theModel.getNewAddress());
                theView.setPhoneNumber(theModel.getPhoneNumber());
            }
            catch (NumberFormatException e1){
                theView.displayErrorMsg();
            }



        }
    }

}