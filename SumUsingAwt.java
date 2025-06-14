package awtswing;

import java.awt.*;
import java.awt.event.*;
import java.awt.Button;

public class SumUsingAwt implements ActionListener{
Frame f;
Button b;
TextField tf1,tf2,tf3;

SumUsingAwt(){
	f = new Frame("Sum");
	b = new Button("sum");
	f.add(b);
	
	b.addActionListener(this);
	
	tf1 = new TextField();
	tf2 = new TextField();
	tf3 = new TextField();
	
	f.add(tf1);
	f.add(tf2);
	f.add(tf3);
	
	
	f.setLayout(new FlowLayout());
	f.setSize(400,400);
	f.setVisible(true);
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int n3 = n1+n2;
		String result = String.valueOf(n3);
		tf3.setText(result);
		
		
	}
public static void main(String[] args) {
	new SumUsingAwt();
}
}
