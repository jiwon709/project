package action;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import CAN.can;
import DrikingwaterMachine.DBAPP;
import DrikingwaterMachine.DrikingwaterMachineADMIN;
//////////////////////////////////음료 추가 팝업창//////////////////////////
public class addcanFrame extends JFrame {
	
	private String [] names = {
			"스프라이트","코코팜","웰치스","블루하와이","복숭아음료"
			,"봉봉","스파클링","암바사","환타"
	};
	
	 public static Checkbox c[] = new Checkbox[9];
	 
	 
	public addcanFrame() {
	
		
		setTitle("음료 팝업창");
		setSize(250,400);
		setLocation(900, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(280, 550));
		show1();
        setVisible(false);
	}
	
	void show1(){
		JPanel panel = new JPanel(new GridLayout(10, 0));
	
		
		JPanel p1 = new JPanel(); JPanel p2 = new JPanel(); JPanel p3 = new JPanel(); 
		JPanel p4 = new JPanel(); JPanel p5 = new JPanel(); JPanel p6 = new JPanel();
		JPanel p7 = new JPanel(); JPanel p8 = new JPanel(); JPanel p9 = new JPanel();
		JPanel p10 = new JPanel();
		
      for(int i=0; i<9; i++) {  
    	  c[i] = new Checkbox(names[i]);
    	  c[i].addItemListener(new addcanaction());
    	 
      }
		
	
		JButton waterplus = new JButton("음료추가");
		waterplus.setBackground(Color.white);
		waterplus.addActionListener(new ActionListener() {
		  @Override
			public void actionPerformed(ActionEvent e) {
				for(int i =0; i<9; i++) {
					
					if (addcanaction.count[i] == 1) {
					
						try {
							new DBAPP();
							  int rs;     
							  String sql;
                            sql ="UPDATE cantable set cannumber= (cannumber+1) where id =(1+" + i + ")"; 
                            rs = DBAPP.stmt.executeUpdate( sql ); 
                  	  	  DBAPP.stmt.close();  
                	  	  DBAPP.conn.close();   
						}catch ( SQLException  e1 ) {
						  	  System.err.println("DB Error" + e1.getMessage());     
						  	  return; 
						  	  }
					}
					
				}
				for(int i =0; i<9; i++) {
				addcanaction.count[i] = 0;
				c[i].setState(false);
				}
				
			
				//JTABLE 자료 갱신
				//https://m.blog.naver.com/PostView.nhn?blogId=battledocho&logNo=220014094399&proxyReferer=http%3A%2F%2Fwww.google.co.kr%2Furl%3Fsa%3Dt%26rct%3Dj%26q%3D%26esrc%3Ds%26source%3Dweb%26cd%3D1%26ved%3D2ahUKEwj31Int5-zfAhUCa94KHfYMCCQQFjAAegQIChAB%26url%3Dhttp%253A%252F%252Fm.blog.naver.com%252Fbattledocho%252F220014094399%26usg%3DAOvVaw0YM6yIud8Y7oAx6pSGz23p
				
				JOptionPane.showMessageDialog(new JFrame(), "선택하신 음료가 추가되었습니다");
				DrikingwaterMachineADMIN.model.setRowCount(0); //전체테이블 화면 지워줌
	
				try {
				    new DBAPP();
					can.canshow(); //수정한 전체값 다시 받아옴
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	
	

		p1.add(c[0]); 
		p2.add(c[1]);
		p3.add(c[2]);
		p4.add(c[3]); 
		p5.add(c[4]); 
		p6.add(c[5]); 
		p7.add(c[6]); 
		p8.add(c[7]); 
		p9.add(c[8]); 
		p10.add(waterplus);
		

		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(p5);
		panel.add(p6);
		panel.add(p7);
		panel.add(p8);
		panel.add(p9);
		panel.add(p10);
		add(panel);
	}
	
}