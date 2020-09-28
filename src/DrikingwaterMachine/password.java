package DrikingwaterMachine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import CAN.can;
import COIN.coin;

public class password extends JFrame{
	 static can c1; 
	 static DrikingwaterMachineADMIN d1 =	new DrikingwaterMachineADMIN();
	 password(){
			setTitle("비밀번호창");
			setSize(400,100);
			setLocation(500, 0);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());

			show1();
		   
			setVisible(false);
		
	 }
	void show1(){
		
		JPanel panel = new JPanel(new GridLayout(3, 0));
		JPanel p1 = new JPanel();
		p1.setBackground(Color.pink);
		ImageIcon won = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/log.PNG");
		Image originreturn0 =  won .getImage(); 
		Image changereturn0= originreturn0.getScaledInstance(30, 30, Image.SCALE_SMOOTH );
	    ImageIcon return01 = new ImageIcon(changereturn0);
		JButton login = new JButton("접속하기",return01);
	    login.setBackground(Color.white);

	
		 JLabel passtext =new JLabel("비밀번호 입력");
		 final TextField passfield = new TextField(20);
			login.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(passfield.getText().equals("1111")) {
					   
					   c1= new can();
					   new coin();
						d1.setVisible(true);
				  DrikingwaterMachineUSER.p1.setVisible(false);
					}
					else {	JOptionPane.showMessageDialog(new JFrame(), "비밀번호를 다시 입력해주세요");}
				}
			});
		 p1.add(passtext);
		 p1.add(passfield);
		 
		 p1.add(login);
		 
	     panel.add(p1);
		
		add(panel , BorderLayout.NORTH);
		 
	 }
}
