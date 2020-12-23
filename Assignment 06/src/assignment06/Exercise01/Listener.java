package assignment06.Exercise01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener {

    private PerformAction[] ToDo;
    private JPanel hello;


    public Listener(PerformAction a,JPanel hello){
        ToDo = new PerformAction[] {a};
        this.hello = hello;
    }

    public Listener(PerformAction[] a,JPanel hello){
        ToDo = a;
        this.hello=hello;
    }

    public void actionPerformed(ActionEvent e){

        try {
            for(PerformAction p: ToDo){
                p.perform(hello); // ToDo Change to actual JPanel
            }

        }
        catch (NumberFormatException e1){

        }
    }

}
