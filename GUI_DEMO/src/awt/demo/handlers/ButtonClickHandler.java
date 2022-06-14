package awt.demo.handlers;

import awt.demo.GuiButtons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickHandler implements ActionListener {
    private String defaultLabel;
    private TextField tfield;
    private Label tLabel;

    public ButtonClickHandler(TextField tfield, Label tLabel,String defaultLabel) {
        this.tfield = tfield;
        this.tLabel = tLabel;
        this.defaultLabel = defaultLabel;
    }

   private GuiButtons guiButtons = new GuiButtons();
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("SEND")){
            tLabel.setText(tfield.getText());
        }
        else if(e.getActionCommand().equals("CLEAR")){
            tLabel.setText(defaultLabel);
            tfield.setText("");
        }
    }
}
