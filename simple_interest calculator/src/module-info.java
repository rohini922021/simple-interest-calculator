package firstjavaprogram;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

import firstjavaprogram.simpleInterest;

import java.awt.Button;
import java.awt.TextField;

public class simpleInterest implements ActionListener
{
		JFrame f=new JFrame("Simple Interest calculator");    
		 JLabel l1 = new JLabel("principle Amount");  
		 JLabel l2= new JLabel("rate of interast");            
		 JLabel l3 = new JLabel("month");            
		 JLabel l4= new JLabel("payble Amount");
		 
		 TextField t1=new TextField(20);
		 TextField t2=new TextField(20);
		 TextField t3=new TextField(20);
		 TextField t4=new TextField(20);
		 
		 Button b1=new Button("simple interest");
		 Button b2=new Button("clear");
		 Button b3=new Button("Exit");
		 
		 simpleInterest()
		 {
			    l1.setBounds(50,100,100,20);
				l2.setBounds(50,140,100,20);
				l3.setBounds(50,180,100,20);
			    l4.setBounds(50,220,100,20);
			    l4.setBounds(50,220,100,20);
				
		 t1.setBounds(200,100,100,20);
		 t2.setBounds(200,140,100,20);
		 t3.setBounds(200,180,100,20);
		 t4.setBounds(200,220,100,20);

		 b1.setBounds(200,250,90,30);
		 b2.setBounds(150,300,50,20);
		 b3.setBounds(200,300,50,20);
				
		 f.add(l1);
		 f.add(l2);
		 f.add(l3);
		 f.add(l4);

		 f.add(t1);
		 f.add(t2);
		 f.add(t3);
		 f.add(t4);

		 f.add(b1);
		 f.add(b2);
		 f.add(b3);
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 
		 f.setLayout(null);
		 f.setVisible(true);
		 f.setSize(400,400);
		 }
		 public void actionPerformed(ActionEvent e)
		 {
		 float p,r,t,si;
		 p=Float.parseFloat(t1.getText());
		 r=Float.parseFloat(t2.getText());
		 t=Float.parseFloat(t3.getText());
			 si=p*r*t/100;
		 t4.setText("" +si);
		 }
		 public static void main(String args[])
		 {
			new simpleInterest();
}	
}





