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
///////////////////////////////////////������ UI ///////////////////////////////////////////////
public class DrikingwaterMachineADMIN  extends JFrame{
	
	public static DefaultTableModel model;
	public static DefaultTableModel model1;
	public static JTable canTable;
	public static  addcanFrame a1= new addcanFrame();
	public static  addcoinFrame a2 = new addcoinFrame();
	DrikingwaterMachineADMIN(){
		setTitle("�����ڸ��");
		setSize(400,600);
		setLocation(500, 0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(280, 550));
		show1();
		show2();
		setVisible(false);
  		
	}
	
	void show1(){	
	//////////////////////////////////��������/////////////////////////////////////////////////	
	JPanel p1 = new JPanel();
	ImageIcon won = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/log.PNG");
	Image originreturn0 =  won .getImage(); 
	Image changereturn0= originreturn0.getScaledInstance(30, 30, Image.SCALE_SMOOTH );
    ImageIcon return01 = new ImageIcon(changereturn0);
	JButton logout = new JButton("��������",return01);
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
    	
	 
    //////////////////////////////////���� ����/////////////////////////////////////////////////	
 	
	 
	ImageIcon won1 = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/plus.PNG");
	Image originreturn1 =  won1 .getImage(); 
	Image changereturn1= originreturn1.getScaledInstance(25, 23, Image.SCALE_SMOOTH );
	 ImageIcon return02 = new ImageIcon(changereturn1);
	 JButton  btnAddCan = new JButton("�����߰�",return02 );
	 btnAddCan.setBackground(Color.WHITE);
	 // ���� �߰� ��ư ���� �� ���� �߰� â ��ü ����
	 btnAddCan.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		a1.setVisible(true);
			
		}
	});
     String[] colName = {"�����̸�","���","�ǸŰ���"}; //�÷��̸�
	  model = new DefaultTableModel(colName,0); 
	  canTable = new JTable(model);//���� ����� ���̺� ����
	  JScrollPane canScrollPanel = new JScrollPane(canTable);//
	  canScrollPanel.setPreferredSize(new Dimension(230, 150)); //�г� ũ�������ϴ°�
	
        canAdminPanel.add(new JLabel("�������"), BorderLayout.WEST);
		canAdminPanel.add(btnAddCan, BorderLayout.EAST);
		canAdminPanel.add(canScrollPanel, BorderLayout.SOUTH);
		canAdminPanel.setBackground(Color.PINK);
		
		panel1.add(canAdminPanel); 
		
	 //////////////////////////////////�ܵ� ����/////////////////////////////////////////////////	
		
		  JButton  btnAddcoin = new JButton("�����߰�",return02);
		  btnAddcoin.setBackground(Color.WHITE);
		  btnAddcoin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			a2.setVisible(true);
			}
		});
			   
		  String[] coinName = {"��������","��������"}; //�÷��̸�
		  model1 = new DefaultTableModel(coinName,0); 
		  JTable coinTable = new JTable(model1);//���� ����� ���̺� ����
		  JScrollPane coinScrollPanel = new JScrollPane(coinTable);//
		  coinScrollPanel .setPreferredSize(new Dimension(230, 150));
		  
		
		  coinAdminPanel .add(new JLabel("��������"), BorderLayout.WEST);
		  coinAdminPanel.add( btnAddcoin, BorderLayout.EAST);
		  coinAdminPanel.add( coinScrollPanel, BorderLayout.SOUTH);
		  coinAdminPanel.setBackground(Color.PINK);
		  
		  panel1.add(coinAdminPanel); 
		  
		  add(panel1,BorderLayout.CENTER);
	}

 	
  		
	}
	
