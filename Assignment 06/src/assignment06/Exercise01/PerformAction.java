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



}
