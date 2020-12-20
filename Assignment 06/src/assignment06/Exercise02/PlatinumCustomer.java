package assignment06.Exercise02;

import java.util.ArrayList;

public class PlatinumCustomer extends Customer {

    private PlatinumCustomer(String initcustomername, String initpassword){
        password = initpassword;
        customername = initcustomername;
        itemcap=10;
    }
}
