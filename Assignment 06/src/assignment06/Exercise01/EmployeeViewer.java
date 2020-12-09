package assignment06.Exercise01;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EmployeeViewer extends JFrame {

    private final JLabel newAddress = new JLabel("set address:");
    private final JLabel newNumber = new JLabel("set phone number:");
    private final JTextField addressTextField = new JTextField(8);
    private final JTextField phoneNumberTextField = new JTextField(8);
    private final JButton SaveNewAddressButton = new JButton("save address");
    private final JButton saveButton = new JButton("Save");


    EmployeeModel MusterMann = new EmployeeModel("Hans","Muster","Eiche 12","078");



    EmployeeViewer(){
        super("Employee Details");
        JPanel employeePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,250);


        JLabel EmpN = new JLabel(MusterMann.getName());
        JLabel EmpS = new JLabel(MusterMann.getSurname());
        JLabel EmpID = new JLabel(MusterMann.getIDNumber());

        EmpN.setBounds(10,20,80,25);
        EmpS.setBounds(41,20,80,25);
        EmpID.setBounds(85,20,80,25);

        employeePanel.add(EmpN);
        employeePanel.add(EmpS);
        employeePanel.add(EmpID);

        // set labels for the address
        employeePanel.setLayout(null);
        newAddress.setBounds(10,50,80,25);
        employeePanel.add(newAddress);

        // set text field for the new address
        addressTextField.setBounds(130,50,140,25);
        employeePanel.add(addressTextField);


        newNumber.setBounds(10, 80, 120,25);
        employeePanel.add(newNumber);

        phoneNumberTextField.setBounds(130,80,140,25);
        employeePanel.add(phoneNumberTextField);

        saveButton.setBounds(110,130,80,25);
        employeePanel.add(saveButton);



        this.add(employeePanel);

    }


    public String getaddress(){
        return addressTextField.getText();
    }

    public String getphoneNumber(){
        return phoneNumberTextField.getText();
    }

    public void setPhoneNumber(String NewNumber){
        phoneNumberTextField.setText(NewNumber);
    }

    public void setAddress(String NewAddress){
        addressTextField.setText(NewAddress);
    }

    void addAddressListener(ActionListener listenForAddressButton){
        SaveNewAddressButton.addActionListener(listenForAddressButton);
    }

    void displayErrorMsg(){
        JOptionPane.showMessageDialog(this, "Something went wrong");
    }

}