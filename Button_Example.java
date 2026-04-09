import java.awt.*;
import java.awt.event.*;

public class Button_Example extends Frame implements ActionListener{
    Button btn;
    Label lbl;
    int clicks = 0;
    Button_Example(){
        btn = new Button("Click Here");
        btn.setBounds(100,100,100,40);
        lbl = new Label("");
        lbl.setBounds(100,150,150,40);
        btn.addActionListener(this);
        add(btn);
        add(lbl);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        lbl.setText("Clicks: " + ++clicks);
    }
    public static void main(String[] args) {
        new Button_Example();
    }
}
