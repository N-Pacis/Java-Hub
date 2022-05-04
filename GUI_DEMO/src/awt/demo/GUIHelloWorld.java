package awt.demo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.Color.BLACK;

public class GUIHelloWorld extends Frame {
    public static void main(String[] args) {
        new GUIHelloWorld();
    }
    public GUIHelloWorld(){
        this.setBounds(100, 100, 700, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.setBackground(Color.gray);
        this.setTitle("Hello World Demo");

        //label
        Label label = displayLabel("Hello world",BLACK,520,10,150,100);
        this.add(label);

        closeWindowFunctionality(label);
    }

    private void closeWindowFunctionality(Label label){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try{
                    label.setText("Goodbye world");
                    Thread.sleep(3000);
                    dispose();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private TextField displayTextField(String text,Color bgColor,Color fgColor,Boolean editable,int x,int y,int width,int height){
        TextField t1 = new TextField(text);
        t1.setBackground(bgColor);
        this.setForeground(fgColor);
        t1.setEditable(editable);
        t1.setBounds(x,y,width,height);
        return t1;
    }

    private Label displayLabel(String text,Color fgColor,int x,int y,int width,int height){
        Label l1 = new Label(text);
        l1.setBounds(x,y,width,height);
        l1.setForeground(fgColor);
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        return l1;
    }
}
