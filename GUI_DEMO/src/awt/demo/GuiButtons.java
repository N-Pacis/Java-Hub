package awt.demo;

import awt.demo.handlers.ButtonClickHandler;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiButtons extends Frame {
    TextField field;
    private Label tLabel;
    String defaultLabel = "Enter your name: ";

    public static void main(String[] args){
        new GuiButtons(true);
    }
    public GuiButtons(){

    }

    public GuiButtons(Boolean startup){
        this.setBounds(100,100,1000,600);
        this.setVisible(true);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.setTitle("Layouts Demo");

        createFieldWithLabel(110,110,200,30);

        createButton(110,150,200,30,"Submit",Color.GREEN,"SEND");

        createButton(110,190,200,30,"Reset",Color.DARK_GRAY,"CLEAR");

        closeWindowFunctionality();
    }

    private void createFieldWithLabel(int x , int y, int width, int height){
        tLabel = new Label(defaultLabel);
        tLabel.setForeground(Color.BLACK);
        tLabel.setFont(new Font("Arial",Font.BOLD,15));
        tLabel.setBounds(x,y-height,width,height);
        field = new TextField();
        field.setBounds(x, y, width, height);
        this.add(tLabel);
        this.add(field);
    }

    private void createButton(int x , int y, int width, int height,String label,Color color,String value){
        Button b = new Button(label);
        b.setBounds(x,y,width,height);
        b.setBackground(color);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Arial",Font.BOLD,17));
        b.setActionCommand(value);
        b.addActionListener(new ButtonClickHandler(field,tLabel,defaultLabel));
        this.add(b);
    }

    private void closeWindowFunctionality(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}
