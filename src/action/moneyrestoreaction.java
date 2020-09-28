package action;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DrikingwaterMachine.DrikingwaterMachineUSER;

public class moneyrestoreaction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		DrikingwaterMachineUSER.currentmoney.setText("0");
		for(int i=0; i<9; i++) {
			if(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())<Integer.parseInt(DrikingwaterMachineUSER.waterlist[i].getText())) {
				DrikingwaterMachineUSER.waterlist[i].setBackground(Color.WHITE);
			}
		}
			JOptionPane.showMessageDialog(new JFrame(), "ÀÜµ·ÀÌ ¹ÝÈ¯µÇ¾ú½À´Ï´Ù");
	

	}
}
