package awt.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiMenu extends JFrame {
    JFrame f2;
    public GuiMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("M1");
        JMenu m2 = new JMenu("M2");
        JMenu subm1 = new JMenu("Sub M1");
        JMenuItem mit1 = new JMenuItem("M item 1");
        JMenuItem mit2 = new JMenuItem("M item 2");

        //sub menu items
        JMenuItem subItem1 = new JMenuItem("Sub M item 1");
        JMenuItem subItem2 = new JMenuItem("Sub M item 2");

        subm1.add(subItem1);
        subm1.add(subItem2);

        m1.add(subm1);
        m1.add(mit1);
        m1.add(mit2);

        ImageIcon picIcon = new ImageIcon("./resources/icon.jpg");
        Image image = picIcon.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH);
        picIcon = new ImageIcon(image);
        m1.setIcon(UIManager.getIcon("FileChooser.newFolderIcon"));
        m2.setIcon(picIcon);


        mb.add(m1);
        mb.add(m2);

        this.add(mb);
        this.setBounds(100,100,1000,600);
        this.setVisible(true);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBackground(Color.WHITE);
        this.setTitle("Menu Demo");

        mit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2 = new JFrame();
                f2.setBounds(100,100,300,300);
                f2.setVisible(true);
                f2.setBackground(Color.WHITE);
                f2.setTitle("New frame");
            }
        });
    }

    public static void main(String[] args) {
        new GuiMenu();
    }

}
