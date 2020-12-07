package assignment06.Exercise01;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EmployeeViewer extends JFrame {

    private JLabel newAddress = new JLabel("set your new address");
    private JTextField address = new JTextField(15);
    private JButton save = new JButton("save");
    private JTextField phoneNumber = new JTextField(15);
    private JButton newAddressButton = new JButton("save new address");
    private JButton newPhoneNumber = new JButton("save new phone number");



    EmployeeViewer(){
        super("Employee Details");
        JPanel employeePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);


        employeePanel.add(newAddress);
        employeePanel.add(address);
        employeePanel.add(new JLabel("\n"));
        employeePanel.add(new JLabel("set your new phone number"));
        employeePanel.add(new JLabel("\n"));

        employeePanel.add(phoneNumber);
        employeePanel.add(save);


        this.add(employeePanel);

    }


    public String getaddress(){
        return address.getText();
    }

    public String getphoneNumber(){
        return phoneNumber.getText();
    }


    public void setPhoneNumber(String NewNumber){
        phoneNumber.setText(NewNumber);
    }

    public void setAddress(String NewAddress){
        address.setText(NewAddress);
    }

    void addAddressListener(ActionListener listenForAddressButton){
        newAddressButton.addActionListener(listenForAddressButton);
    }

    void addPhoneNumberListener(ActionListener listenForPhoneNumber){
        newPhoneNumber.addActionListener(listenForPhoneNumber);
    }

    void displayErrorMsg(){
        JOptionPane.showMessageDialog(this, "Something went wrong");
    }

}
