package assignment06.Exercise01;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EmployeeViewer extends JFrame {

    private final JLabel newAddress = new JLabel("set your new address");
    private final JTextField address = new JTextField(15);
    private final JButton save = new JButton("save");
    private final JTextField phoneNumber = new JTextField(15);
    private final JButton newAddressButton = new JButton("save new address");
    private final JButton newPhoneNumber = new JButton("save new phone number");


    //TODO: we need an object that has the given things in the first row

    EmployeeModel MusterMann = new EmployeeModel("Hans","Muster","Eiche 12","078");



    EmployeeViewer(){
        super("Employee Details");
        JPanel employeePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);

        employeePanel.add(new JLabel(MusterMann.getName()));
        employeePanel.add(new JLabel(MusterMann.getSurname()));
        employeePanel.add(new JLabel(MusterMann.getNewAddress()));

        employeePanel.add(new JLabel(MusterMann.getPhoneNumber()));
        employeePanel.add(new JLabel("<html>" + MusterMann.getIDNumber() + "<br></html>"));
        //employeePanel.add(new JLabel("<html>" + "set your new address " + "<br></html>"));
        //employeePanel.add(address);


        employeePanel.add(new JLabel("set your new phone number"));

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

    void displayErrorMsg(){
        JOptionPane.showMessageDialog(this, "Something went wrong");
    }

}
