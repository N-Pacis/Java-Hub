package awt.demo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiLayouts extends Frame {
    public static void main(String[] args){
        new GuiLayouts();
    }

    public GuiLayouts(){
        this.setBounds(100,100,1355,720);
        this.setVisible(true);
        this.setLayout(new GridLayout(3,1));
        this.setBackground(Color.WHITE);
        this.setTitle("Layouts Demo");

        createSection(Color.BLUE,110,110,"Heading",10);
        createSectionPanel(Color.GREEN,110,270,1,1, "Content",190);
        createSection(Color.CYAN,110,430,"Footer",50);
        createSection(Color.MAGENTA,110,430,"Footer",50);

        closeWindowFunctionality();
    }

    private void createSection(Color color,int x,int y,String text,int height){
        Label label = new Label("");
        label.setBounds(x,y,1355,height);
        label.setBackground(color);
        label.setForeground(Color.WHITE);
        label.setText(text);
        label.setFont(new Font("ARIAL",Font.BOLD,20));

        this.add(label);
    }

    private void createSectionPanel(Color color,int x,int y,int rows,int cols,String text,int height){
        Panel divPanel = new Panel(new GridLayout(rows,cols));
        Label label = new Label("");
        label.setBounds(x,y,1355,height);
        label.setBackground(color);
        label.setForeground(Color.WHITE);
        label.setText(text);
        label.setFont(new Font("ARIAL",Font.BOLD,20));
        divPanel.add(label);
        this.add(divPanel);
    }

    private void closeWindowFunctionality(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    dispose();
            }
        });
    }


}
