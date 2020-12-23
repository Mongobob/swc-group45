package assignment06.Exercise01;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;



public class EmployeeViewer extends JFrame implements Observer {

    private final JLabel name = new JLabel("Name: ");
    private final JTextField nameField = new JTextField(8);
    private final JTextField surnameField = new JTextField(8);
    private final JLabel surname = new JLabel("Surname: ");
    private final JLabel newAddress = new JLabel("set address:");
    private final JLabel newNumber = new JLabel("set phone number:");
    private final JTextField addressTextField = new JTextField(8);
    private final JTextField phoneNumberTextField = new JTextField(8);
    private final JButton SaveNewAddressButton = new JButton("Save");
    private final JLabel IDNumber = new JLabel("Your ID Number is: ");


    EmployeeModel MusterMann = new EmployeeModel("Hans","Muster","Eiche 12","078");


    EmployeeViewer(){

        super("Employee Details");
        JPanel employeePanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);


        JLabel EmpID = new JLabel(MusterMann.getIDNumber());
        EmpID.setBounds(130,140,80,25);
        employeePanel.add(EmpID);

        // set labels for the address
        employeePanel.setLayout(null);
        name.setBounds(10,20,80,25);
        employeePanel.add(name);

        nameField.setBounds(130,20,140,25);
        employeePanel.add(nameField);

        surname.setBounds(10,50,80,25);
        employeePanel.add(surname);

        surnameField.setBounds(130,50,140,25);
        employeePanel.add(surnameField);

        newAddress.setBounds(10,80,80,25);
        employeePanel.add(newAddress);


        // set text field for the new address
        addressTextField.setBounds(130,80,140,25);
        employeePanel.add(addressTextField);


        newNumber.setBounds(10, 110, 120,25);
        employeePanel.add(newNumber);

        phoneNumberTextField.setBounds(130,110,140,25);
        employeePanel.add(phoneNumberTextField);

        IDNumber.setBounds(10,140,120,25);
        employeePanel.add(IDNumber);


        SaveNewAddressButton.setBounds(105,180,80,25);
        employeePanel.add(SaveNewAddressButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(105,210,80,25);
        employeePanel.add(clearButton);


        PerformAction [] perf = {new PerformAction.saveEmployee(),new PerformAction.cleanWindow()};



        this.addListener(new Listener(perf,employeePanel),clearButton);
        this.add(employeePanel);




    }

    public String getName(){return nameField.getText();}

    public String getSurname(){return surnameField.getText();}

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

    //void addAddressListener(ActionListener listenForAddressButton){
    //    SaveNewAddressButton.addActionListener(listenForAddressButton);
    //}

    void addListener(ActionListener MyListener, JButton MyButton){
        MyButton.addActionListener(MyListener);
    }
    void displayErrorMsg(){
        JOptionPane.showMessageDialog(this, "Something went wrong");
    }

    @Override
    public void update() {

    }
}