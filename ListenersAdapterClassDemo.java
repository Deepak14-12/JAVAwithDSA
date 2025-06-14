
package awtswing;

import java.awt.*;
import java.awt.event.*;
import java.awt.Button;

public class ListenersAdapterClassDemo implements ActionListener{
	Frame f;
	TextField tf;
	Button b1,b2;
	AdapterClassDemo(String s) {
		f = new Frame(s);
		
		b1 = new Button("ok");
		b1.setBounds(20, 180, 40, 40);
		b1.addActionListener(this);
		f.add(b1);
		
		b2 = new Button("cancel");
		b2.setBounds(20, 260, 40, 40);
		//anonymous class inside method parameter
		b2.addActionListener(this);
		f.add(b2);
		

		tf = new TextField();
		tf.addKeyListener(new KeyEventListener());
		tf.setBounds(20, 100, 40, 40);
		f.add(tf);
		f.addWindowListener(new WindowEventListener());
		f.addMouseListener(new MouseEventListener(this));
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);

	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListenersAdapterClassDemo("Adapter Frame Demo");
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

}
                         //implements WindowListener
class WindowEventListener extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
                        //implements MouseListener
class MouseEventListener extends MouseAdapter{
	AdapterClassDemo t;
	MouseEventListener(AdapterClassDemo t){
		this.t= t;
	}
	public void mouseClicked(MouseEvent e) {
		t.tf.setText("mouse clicked");
		t.f.setBackground(Color.cyan);
	}
}

//implements KeyListener
class KeyEventListener extends KeyAdapter{
public void keyTyped(KeyEvent e) {
System.out.println(e.getKeyChar());

}
}
