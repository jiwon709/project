package action;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import COIN.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DrikingwaterMachine.DBAPP;
import DrikingwaterMachine.DrikingwaterMachineADMIN;
//////////////////////////////////�� �߰� �˾�â//////////////////////////
public class addcoinFrame  extends JFrame {
private String [] coinnames = {
			
			"100","500","1000","5000","10000"
			
	};
   public static Checkbox coinbox[] = new Checkbox[5];
   public addcoinFrame() {
	   setTitle("���� �˾�â");
		setSize(250,400);
		setLocation(900, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(280, 550));
		show2();
       setVisible(false);
}
void show2(){
	   JPanel panel = new JPanel(new GridLayout(6, 0));
		
			
			JPanel p1 = new JPanel(); JPanel p2 = new JPanel(); JPanel p3 = new JPanel(); 
			JPanel p4 = new JPanel(); JPanel p5 = new JPanel(); JPanel p6 = new JPanel();
			
			
	      for(int i=0; i<5; i++) {  
	    	  coinbox[i] = new Checkbox(coinnames[i]);
	    	  coinbox[i].addItemListener(new addcoinaction());
	    	 
	      }
		     JButton coinplus = new JButton("���� �߰�");
			coinplus.setBackground(Color.white);
			coinplus.addActionListener(new ActionListener() {
			  @Override
				public void actionPerformed(ActionEvent e) {
				  // addcanaction �迭 ������ 1 �ΰ� -> ���� �߰�
					for(int i =0; i<5; i++) {
						
						if (addcoinaction.count[i] == 1) {
						System.out.println("gg");
							try {
								new DBAPP();
								  int rs;     
								  String sql;
	                            sql ="UPDATE cointable set coinnumber= (coinnumber+1) where id =(1+" + i + ")"; 
	                            rs = DBAPP.stmt.executeUpdate( sql ); 
	                            
	                            
	                  	  	  DBAPP.stmt.close();  
	                	  	  DBAPP.conn.close();   
							}catch ( SQLException  e1 ) {
							  	  System.err.println("DB Error" + e1.getMessage());     
							  	  return; 
							  	  }
						}
						
					}
					// �̺�Ʈ �Ϸ� / �� �߰��� �Ϸ�� �� -> �迭 0���� �ٲ��ֱ�
					for(int i =0; i<5; i++) {
					addcoinaction.count[i] = 0;
					coinbox[i].setState(false);
					}
					
				
					//JTABLE �ڷ� ����
					//https://m.blog.naver.com/PostView.nhn?blogId=battledocho&logNo=220014094399&proxyReferer=http%3A%2F%2Fwww.google.co.kr%2Furl%3Fsa%3Dt%26rct%3Dj%26q%3D%26esrc%3Ds%26source%3Dweb%26cd%3D1%26ved%3D2ahUKEwj31Int5-zfAhUCa94KHfYMCCQQFjAAegQIChAB%26url%3Dhttp%253A%252F%252Fm.blog.naver.com%252Fbattledocho%252F220014094399%26usg%3DAOvVaw0YM6yIud8Y7oAx6pSGz23p
					
					JOptionPane.showMessageDialog(new JFrame(), "������ �߰��Ǿ����ϴ�");
					DrikingwaterMachineADMIN.model1.setRowCount(0); //��ü���̺� ȭ�� ������
		
					try {
					    new DBAPP();
						coin.coinshow(); //������ ��ü�� �ٽ� �޾ƿ�
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
		
	
			p1.add(coinbox[0]); 
			p2.add(coinbox[1]);
			p3.add(coinbox[2]);
			p4.add(coinbox[3]); 
			p5.add(coinbox[4]); 
		 
			p6.add(coinplus);
			
			panel.add(p1);
			panel.add(p2);
			panel.add(p3);
			panel.add(p4);
			panel.add(p5);
			panel.add(p6);
		
			add(panel);
		}
	}