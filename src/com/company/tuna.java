package com.company;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tuna extends JFrame {
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public tuna(){
        super("This is the title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1); //add this to the window

        item2 = new JTextField("enter text here");
        add(item2);

        item3 = new JTextField("uneditable",20);
        item3.setEditable(false);
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);

        //now we're doing some verifivation kind of stuff, action listen
        //you want it to wait for an event

        theHandler handler = new theHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
    }
    private class theHandler implements ActionListener{
        //takes one method,
        public void actionPerformed(ActionEvent event){
            //this handles the event  if somethinh happens
            String string = "";

            if(event.getSource()==item1){
                string=String.format("filed 1: %s", event.getActionCommand());
            }
            else if(event.getSource()==item2)
                string=String.format("filed 2: %s", event.getActionCommand());
            else if(event.getSource()==item3)
                string=String.format("filed 3: %s", event.getActionCommand());
            else if(event.getSource()==passwordField)
                string=String.format("password field is %s", event.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
        }
    }


}