package action;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import DrikingwaterMachine.DrikingwaterMachineUSER;

public class waterbuttonaction implements  ActionListener {

	public static ImageIcon return00 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C0.PNG");
	 public static ImageIcon return01 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C1.PNG");
	 public static ImageIcon return02 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C2.PNG");
	 public static ImageIcon return03 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C3.PNG");
	 public static ImageIcon return04 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C4.PNG");
	 public static ImageIcon return05 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C5 .PNG");
	 public static ImageIcon return06 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C6.PNG");
	 public static ImageIcon return07 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C7.PNG");
	 public static ImageIcon return08 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C8 (2).PNG");
	 public static ImageIcon return09 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/C9 (2).PNG");
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int canmoney = Integer.parseInt(((JButton) e.getSource()).getText());
		//System.out.println(((JButton) e.getSource()).getText());
	
		if((Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())<canmoney)){
			JOptionPane.showMessageDialog(new JFrame(), "돈이 부족합니다 돈을 투입해주세요");
		}
		else{DrikingwaterMachineUSER.currentmoney.setText(Integer.toString(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())-canmoney));
		 if(((JButton) e.getSource()).getName().equals("CAN0")){
			 DrikingwaterMachineUSER.originreturn0 =  return01.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		  }
		 if(((JButton) e.getSource()).getName().equals("CAN1")){
		
			 DrikingwaterMachineUSER.originreturn0 =  return02.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }
		 if(((JButton) e.getSource()).getName().equals("CAN2")){
		
			 DrikingwaterMachineUSER.originreturn0 =  return03.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
					  }
		 if(((JButton) e.getSource()).getName().equals("CAN3")){
			 DrikingwaterMachineUSER.originreturn0 =  return04.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }
		 if(((JButton) e.getSource()).getName().equals("CAN4")){
			 DrikingwaterMachineUSER.originreturn0 =  return05.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }
		 if(((JButton) e.getSource()).getName().equals("CAN5")){
			 DrikingwaterMachineUSER.originreturn0 =  return06.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }
		 if(((JButton) e.getSource()).getName().equals("CAN6")){
			 DrikingwaterMachineUSER.originreturn0 =  return07.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }
		 if(((JButton) e.getSource()).getName().equals("CAN7")){
			 DrikingwaterMachineUSER.originreturn0 =  return08.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }
		 if(((JButton) e.getSource()).getName().equals("CAN8")){
			 DrikingwaterMachineUSER.originreturn0 =  return09.getImage(); 
			 DrikingwaterMachineUSER.changereturn0=  DrikingwaterMachineUSER.originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
			 DrikingwaterMachineUSER.return0 = new ImageIcon( DrikingwaterMachineUSER.changereturn0);
			 DrikingwaterMachineUSER. ret.setIcon( DrikingwaterMachineUSER.return0);
		 }	
		 //구입가능할 때 노란색으로 바뀐거 구입불가능(금액부족)할때 다시 흰색으로 바꿔줌
			for(int i=0; i<9; i++) {
				if(Integer.parseInt(DrikingwaterMachineUSER.currentmoney.getText())<Integer.parseInt(DrikingwaterMachineUSER.waterlist[i].getText())) {
					DrikingwaterMachineUSER.waterlist[i].setBackground(Color.WHITE);
				}
			}
		 //3초뒤에 캔 없어지도록하기
		 
		 }
		}
	}


	


