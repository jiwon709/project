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


/////////////////////���� �߰� �ϴ� �̺�Ʈ//////////////////
public class addcanaction implements ItemListener{
	
	public static int count[] = {0,0,0,0,0,0,0,0,0};
	@Override
	public void itemStateChanged(ItemEvent e) {
		
			if( e.getStateChange() == ItemEvent.SELECTED) {
				
				if(e.getItem().equals("��������Ʈ")) {
				   count[0]=1;
			   }
			   if(e.getItem().equals("������")) {
				   count[1]=1;
			   }
			   if(e.getItem().equals("��ġ��")) {
				   count[2]=1;
			   }
			   if(e.getItem().equals("����Ͽ���")) {
				   count[3]=1;
			   }
			   if(e.getItem().equals("������ ����")) {
				   count[4]=1;
			   }
			   if(e.getItem().equals("����")) {
				   count[5]=1;
			   }
			   if(e.getItem().equals("����Ŭ��")) {
				   count[6]=1;
			   }
			   if(e.getItem().equals("�Ϲٻ�")) {
				   count[7]=1;
			   }
			   if(e.getItem().equals("ȯŸ")) {
				   count[8]=1;
			   }
			}
			if( e.getStateChange() == ItemEvent.DESELECTED)  {
					if(e.getItem().equals("��������Ʈ")) {
						   count[0]=0;
					   }
					   if(e.getItem().equals("������")) {
						   count[1]=0;
					   }
					   if(e.getItem().equals("��ġ��")) {
						   count[2]=0;
					   }
					   if(e.getItem().equals("����Ͽ���")) {
						   count[3]=0;
					   }
					   if(e.getItem().equals("������ ����")) {
						   count[4]=0;
					   }
					   if(e.getItem().equals("����")) {
						   count[5]=0;
					   }
					   if(e.getItem().equals("����Ŭ��")) {
						   count[6]=0;
					   }
					   if(e.getItem().equals("�Ϲٻ�")) {
						   count[7]=0;
					   }
					   if(e.getItem().equals("ȯŸ")) {
						   count[8]=0;
					   }
			   }
		
		}
		
	}

	


