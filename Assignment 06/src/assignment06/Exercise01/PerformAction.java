package assignment06.Exercise01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public interface PerformAction {

    void perform(JPanel view);

    class DataForAction implements PerformAction{

        protected JPanel view;
        protected Component[] components;

        public void perform(JPanel currentView){
            view = currentView;
            components = currentView.getComponents();
        };
    }

    class cleanWindow extends DataForAction{

        public void perform(JPanel View){
            super.perform(View);

            for(Component c : super.components){
                super.view.remove(c);
            }

            super.view.revalidate();
            super.view.repaint();
        }
    }

    class makeNewEmployeeWindow extends DataForAction{

        public void perform(JPanel View){
            super.perform(View);
        }
    }

    class makeChangesWindow extends DataForAction{

        public void perform(JPanel View){
            super.perform(View);
        }
    }

    class saveEmployee extends DataForAction{

        //EmployeeModel theModel;
        //EmployeeViewer theView;

        public void perform(JPanel View){
            super.perform(View);
            String address="",phoneNumber="",name="",surname="";

            Component na = View.getComponent(2);
            if(na instanceof JTextField){
                name = ((JTextField) na).getText();
            }
            Component sur = View.getComponent(4);
            if(sur instanceof JTextField){
                surname = ((JTextField) sur).getText();
            }
            Component c = View.getComponent(6);
            if(c instanceof JTextField){
                address = ((JTextField) c).getText();
            }
            Component n = View.getComponent(8);
            if(n instanceof JTextField){
                phoneNumber = ((JTextField) n).getText();
            }


            System.out.println(""+name);
            System.out.println(""+surname);

            System.out.println(""+address);
            System.out.println(""+phoneNumber);
            EmployeeModel e = new EmployeeModel(name,surname,address,phoneNumber);
            Archive.getInstance().listEmp.add(e);


        }
        class printEmp extends DataForAction{

            public void perform(JPanel View){
                super.perform(View);
                ArrayList<EmployeeModel> list = Archive.getInstance().listEmp;
                int a = list.size();
                EmployeeModel e = list.get(a);

                View.add(new JLabel(e.getName()));
                View.add(new JLabel(e.getSurname()));
                View.add(new JLabel(e.getNewAddress()));
                View.add(new JLabel(e.getPhoneNumber()));
                View.add(new JLabel(e.getIDNumber()));
            }
        }
    }




}
