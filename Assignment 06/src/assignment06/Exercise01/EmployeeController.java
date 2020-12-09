package assignment06.Exercise01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeController {
    private final EmployeeModel theModel;
    private final EmployeeViewer theView;

    public EmployeeController(EmployeeViewer theView, EmployeeModel theModel){
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addAddressListener(new AddressListener());
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