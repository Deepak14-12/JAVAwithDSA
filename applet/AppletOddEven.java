package applet;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletOddEven extends Applet implements ActionListener {
	TextField t1 = new TextField(10);
        Label l1 = new Label("enter number to check");
	TextField t2 = new TextField(10);
	Label l2 = new Label("Number is: ");

	Button b = new Button("Check");

	public void init() {
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b) {
		int n1 = Integer.parseInt(t1.getText());
		if(n1%2==0) 
                   t2.setText("Even number");
                else t2.setText("Odd number");
	}
}
}
