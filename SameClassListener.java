package awtswing;
import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
public class SameClassListener implements ActionListener{
	Frame f;
	TextField tf;
	Button b1,b2;
	SameClassListener(String s) {
		f = new Frame(s);
		tf = new TextField();
		tf.setBounds(20, 100, 40, 40);
		f.add(tf);
		
		b1 = new Button("ok");
		b1.setBounds(20, 180, 40, 40);
		b1.addActionListener(this);
		f.add(b1);
		
		b2 = new Button("cancel");
		b2.setBounds(20, 260, 40, 40);
		b2.addActionListener(this);
		f.add(b2);
		
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ap");
		if(e.getSource()==b1) {
			tf.setText("hello");
		}
		if(e.getSource()==b2) {
			tf.setText("cancel");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SameClassListener("Frame demo");
	}

}
