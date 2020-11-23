package src.assignment05.Exercise01;

public class Main {
    public static void main(String[] args){
        //Input to Bakery:String initname, String initstreetname, int initnumber, String initpostalcode, String initcity
        BreadBakery bak = new BreadBakery("Sugarplum","Sesame-Street",25,"8051","Basel");

        CityOffice baselOffice = new CityOffice("Basel");
        baselOffice.addBakery(bak);
        CentralOffice centraloffice = CentralOffice.getInstance();
        centraloffice.addOffice(baselOffice);
        centraloffice.printAllOffices();
        BreadBakery bak2 = new BreadBakery("Sandwichwizard","Sesame-Street",27,"8051","Basel");
        baselOffice.addBakery(bak2);
        centraloffice.printAllOffices();

    }

}
