package action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DrikingwaterMachine.DBAPP;
import DrikingwaterMachine.DrikingwaterMachineUSER;


/////////////////////음료 추가 하는 이벤트//////////////////
public class addcanaction implements ItemListener{
	
	public static int count[] = {0,0,0,0,0,0,0,0,0};
	@Override
	public void itemStateChanged(ItemEvent e) {
		
			if( e.getStateChange() == ItemEvent.SELECTED) {
				
				if(e.getItem().equals("스프라이트")) {
				   count[0]=1;
			   }
			   if(e.getItem().equals("코코팜")) {
				   count[1]=1;
			   }
			   if(e.getItem().equals("웰치스")) {
				   count[2]=1;
			   }
			   if(e.getItem().equals("블루하와이")) {
				   count[3]=1;
			   }
			   if(e.getItem().equals("복숭아 음료")) {
				   count[4]=1;
			   }
			   if(e.getItem().equals("봉봉")) {
				   count[5]=1;
			   }
			   if(e.getItem().equals("스파클링")) {
				   count[6]=1;
			   }
			   if(e.getItem().equals("암바사")) {
				   count[7]=1;
			   }
			   if(e.getItem().equals("환타")) {
				   count[8]=1;
			   }
			}
			if( e.getStateChange() == ItemEvent.DESELECTED)  {
					if(e.getItem().equals("스프라이트")) {
						   count[0]=0;
					   }
					   if(e.getItem().equals("코코팜")) {
						   count[1]=0;
					   }
					   if(e.getItem().equals("웰치스")) {
						   count[2]=0;
					   }
					   if(e.getItem().equals("블루하와이")) {
						   count[3]=0;
					   }
					   if(e.getItem().equals("복숭아 음료")) {
						   count[4]=0;
					   }
					   if(e.getItem().equals("봉봉")) {
						   count[5]=0;
					   }
					   if(e.getItem().equals("스파클링")) {
						   count[6]=0;
					   }
					   if(e.getItem().equals("암바사")) {
						   count[7]=0;
					   }
					   if(e.getItem().equals("환타")) {
						   count[8]=0;
					   }
			   }
		
		}
		
	}

	


