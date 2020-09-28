package action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTextField;

import DrikingwaterMachine.DrikingwaterMachineUSER;

public class putmoney implements  ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
	 
		if(((JButton) e.getSource()).getName().equals("BTN0")) {
			DrikingwaterMachineUSER.currentmoney.setText(Integer.toString(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())+1000));
		//static이니까 클래스명.~	
		}
		else if(((JButton) e.getSource()).getName().equals("BTN1")) {
			DrikingwaterMachineUSER.currentmoney.setText(Integer.toString(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())+5000));		
			}
		else if(((JButton) e.getSource()).getName().equals("BTN2")) {
			DrikingwaterMachineUSER.currentmoney.setText(Integer.toString(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())+10000));	
			}
		else if(((JButton) e.getSource()).getName().equals("BTN3")) {
			DrikingwaterMachineUSER.currentmoney.setText(Integer.toString(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())+500));	
			}
		else if(((JButton) e.getSource()).getName().equals("BTN4")) {
			DrikingwaterMachineUSER.currentmoney.setText(Integer.toString(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())+100));
			}
		// 구입가능한 음료수 노란색으로 불들어옴
		for(int i=0; i<9; i++) {
			if(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())>=Integer.parseInt(DrikingwaterMachineUSER.waterlist[i].getText())) {
				DrikingwaterMachineUSER.waterlist[i].setBackground(Color.yellow);
			}
		}
		
	} 

}
