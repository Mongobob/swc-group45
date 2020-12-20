package assignment06.Exercise02;

import java.util.ArrayList;

public class GoldCustomer extends Customer{
    private GoldCustomer(String initcustomername, String initpassword) {
        password = initpassword;
        customername = initcustomername;
        itemcap =5;
    }
}