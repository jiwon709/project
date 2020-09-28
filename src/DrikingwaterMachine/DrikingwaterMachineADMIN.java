package DrikingwaterMachine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import action.addcanFrame;
import action.addcoinFrame;
import action.waterbuttonaction;
///////////////////////////////////////관리자 UI ///////////////////////////////////////////////
public class DrikingwaterMachineADMIN  extends JFrame{
	
	public static DefaultTableModel model;
	public static DefaultTableModel model1;
	public static JTable canTable;
	public static  addcanFrame a1= new addcanFrame();
	public static  addcoinFrame a2 = new addcoinFrame();
	DrikingwaterMachineADMIN(){
		setTitle("관리자모드");
		setSize(400,600);
		setLocation(500, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(280, 550));
		show1();
		show2();
		setVisible(false);
  		
	}
	
	void show1(){	
	//////////////////////////////////접속해제/////////////////////////////////////////////////	
	JPanel p1 = new JPanel();
	ImageIcon won = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/log.PNG");
	Image originreturn0 =  won .getImage(); 
	Image changereturn0= originreturn0.getScaledInstance(30, 30, Image.SCALE_SMOOTH );
    ImageIcon return01 = new ImageIcon(changereturn0);
	JButton logout = new JButton("접속해제",return01);
    logout.setBackground(Color.white);
    logout.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setVisible(false);
			a1.setVisible(false);
	
			a2.setVisible(false);
			
		}
	});
	p1.add(logout);
	add(p1,BorderLayout.NORTH);
	}
	void show2() {
     JPanel panel1 = new JPanel(new GridLayout(2, 0));
	 JPanel canAdminPanel = new JPanel();
	 JPanel coinAdminPanel = new JPanel();
    	
	 
    //////////////////////////////////음료 관리/////////////////////////////////////////////////	
 	
	 
	ImageIcon won1 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/plus.PNG");
	Image originreturn1 =  won1 .getImage(); 
	Image changereturn1= originreturn1.getScaledInstance(25, 23, Image.SCALE_SMOOTH );
	 ImageIcon return02 = new ImageIcon(changereturn1);
	 JButton  btnAddCan = new JButton("음료추가",return02 );
	 btnAddCan.setBackground(Color.WHITE);
	 // 음료 추가 버튼 누를 시 음료 추가 창 객체 생성
	 btnAddCan.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		a1.setVisible(true);
			
		}
	});
     String[] colName = {"음료이름","재고","판매가격"}; //컬럼이름
	  model = new DefaultTableModel(colName,0); 
	  canTable = new JTable(model);//모델을 사용해 테이블 생성
	  JScrollPane canScrollPanel = new JScrollPane(canTable);//
	  canScrollPanel.setPreferredSize(new Dimension(230, 150)); //패널 크기지정하는것
	
        canAdminPanel.add(new JLabel("음료관리"), BorderLayout.WEST);
		canAdminPanel.add(btnAddCan, BorderLayout.EAST);
		canAdminPanel.add(canScrollPanel, BorderLayout.SOUTH);
		canAdminPanel.setBackground(Color.PINK);
		
		panel1.add(canAdminPanel); 
		
	 //////////////////////////////////잔돈 관리/////////////////////////////////////////////////	
		
		  JButton  btnAddcoin = new JButton("동전추가",return02);
		  btnAddcoin.setBackground(Color.WHITE);
		  btnAddcoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			a2.setVisible(true);
			}
		});
			   
		  String[] coinName = {"동전종류","남은갯수"}; //컬럼이름
		  model1 = new DefaultTableModel(coinName,0); 
		  JTable coinTable = new JTable(model1);//모델을 사용해 테이블 생성
		  JScrollPane coinScrollPanel = new JScrollPane(coinTable);//
		  coinScrollPanel .setPreferredSize(new Dimension(230, 150));
		  
		
		  coinAdminPanel .add(new JLabel("동전관리"), BorderLayout.WEST);
		  coinAdminPanel.add( btnAddcoin, BorderLayout.EAST);
		  coinAdminPanel.add( coinScrollPanel, BorderLayout.SOUTH);
		  coinAdminPanel.setBackground(Color.PINK);
		  
		  panel1.add(coinAdminPanel); 
		  
		  add(panel1,BorderLayout.CENTER);
	}

 	
  		
	}
	
