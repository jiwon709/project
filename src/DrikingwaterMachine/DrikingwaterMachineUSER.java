package DrikingwaterMachine;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import action.moneyrestoreaction;
import action.putmoney;
import action.waterbuttonaction;

///////////////////////////////////////사용자 UI ///////////////////////////////////////////////
public class DrikingwaterMachineUSER extends JFrame {
	
	 JLabel current = new JLabel("투입금액 ");
	 public static JLabel currentmoney = new JLabel("0");
	 public static JLabel ret = new JLabel();
	 public final static JButton 		 waterlist[] = {
				new JButton("1000"),
				new JButton("800"),
				new JButton("900"),
				new JButton("1100"),
				new JButton("600"),
				new JButton("700"),
				new JButton("1500"),
				new JButton("1200"),
				new JButton("1400"),
		};
	 public static Image originreturn0 = waterbuttonaction.return00.getImage(); 
	 public static Image changereturn0= originreturn0.getScaledInstance(180, 60, Image.SCALE_SMOOTH );
	 public static ImageIcon return0 = new ImageIcon(changereturn0);
	 public static JPanel panel4 = new JPanel();
	 public static password p1;
	
	 DrikingwaterMachineUSER(){
		setTitle("음료수 자판기");
		setSize(450,700);
		 
		setLayout(new BorderLayout());;
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    	show1();
    	show2();
    	show3();
    	setVisible(true);
	}
	 
	
	////////////////////////////////////////////////////////////////////////
	void show1() {
		
		JPanel Nmain= new JPanel(new GridLayout(2, 0));
		JPanel panel1 = new JPanel();	 
	    JPanel panel2 = new JPanel(new GridLayout(2, 0));
	    JPanel p3 = new JPanel();
	    JPanel p4 = new JPanel();
	    
	    p3.setBackground(Color.pink);
	    p4.setBackground(Color.pink);

		
		ImageIcon logo =  new ImageIcon("C:/Users/jimon/Desktop/TEST1226/src/DrikingwaterMachine/음자.PNG");
		
		ImageIcon money[] = { 
			    new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/1000원.PNG"),
				 new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/5000won.PNG"),
		         new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/10000won.PNG"),
				 new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/500won.PNG"),
			     new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/100won.PNG"),
			     new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/btt.png")
		}; // 돈 버튼에 넣을 이미지 생성
	
		JLabel logoimage = new JLabel(logo); //음료수 자판기 로고
		
		//돈 버튼 생성
		JButton moneybutton[] = {
				new JButton(money[0]), //1000원짜리 버튼
				new JButton(money[1]), //5000원짜리 버튼
				new JButton(money[2]), //10000원짜리 버튼
				new JButton(money[3]), //500원짜리 버튼
				new JButton(money[4]),
				new JButton(money[5])//100원짜리 버튼 
			    }; 
        JButton returnmoney = new JButton(money[5]);
	     returnmoney.addActionListener(new moneyrestoreaction());
		
		//버튼 이미지
	    Image originImg1[] = new Image[6];
		Image changedImg1[] =  new Image[6];
        ImageIcon Icon1[] =  new ImageIcon[6];
        //돈 버튼 이미지 크기 조정
		for(int i=0; i<5; i++) {
			//돈버튼 이벤트 처리 - putmoney class 객체화
			moneybutton[i].addActionListener(new putmoney());
			//
			originImg1[i] = money[i].getImage(); 
			moneybutton[i].setName("BTN"+i); // 중요!! 이벤트 처리시 getsource시 배열의 주소값(??쓰레기값??) 얻어오기 때문에 반드시 setname 설정해줘야함!
			if(i<3) {
				moneybutton[i].setPreferredSize(new Dimension(100, 50));
				changedImg1[i]= originImg1[i].getScaledInstance(100, 50, Image.SCALE_SMOOTH );
			}
			else {
				moneybutton[i].setPreferredSize(new Dimension(50, 50));
				changedImg1[i]= originImg1[i].getScaledInstance(50, 50, Image.SCALE_SMOOTH );
			}
		    Icon1[i]= new ImageIcon(changedImg1[i]);
			moneybutton[i].setIcon(Icon1[i]);
			
		    p3.add(moneybutton[i]);
		}
		
		originImg1[5] = money[5].getImage();
		returnmoney.setPreferredSize(new Dimension(50, 50));
		changedImg1[5]= originImg1[5].getScaledInstance(50, 50, Image.SCALE_SMOOTH );
		Icon1[5]= new ImageIcon(changedImg1[5]);
		returnmoney.setIcon(Icon1[5]);
		returnmoney.setContentAreaFilled(false);
		
		panel1.add(logoimage);
		Nmain.add(panel1);
	    p4.add(current);
		p4.add(currentmoney);
		p4.add(returnmoney);
		panel2.add(p3);
	    panel2.add(p4);
	    Nmain.add(panel2);
	    add(Nmain,BorderLayout.NORTH);

	}
	////////////////////////////////////////////////////////////////////////
	
	void show2() {
		JPanel panel3 = new JPanel(new GridLayout(3, 3,10,10));
		panel3.setBackground(Color.WHITE);
		ImageIcon drinking_water[] = new ImageIcon[10];
		for(int i =0; i<10; i++) {
			drinking_water[i] = new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/"+(1+i)+".PNG");
		}
		
	for(int i=0; i<9; i++) {
		waterlist[0].setIcon(drinking_water[i]);
	}
////
		
		Image originImg2[] = new Image[10];
		Image changedImg2[] =  new Image[10];
	    ImageIcon Icon2[] =  new ImageIcon[10];
		
		for(int i =0; i<10; i++) {
		    
			   originImg2[i] = drinking_water[i].getImage(); 
			   changedImg2[i] = originImg2[i].getScaledInstance(40, 70, Image.SCALE_SMOOTH );
		       Icon2[i] = new ImageIcon(changedImg2[i]);
		     
		     if(i>=0&&i<9)  {
		    	
		    	 waterlist[i].setName("CAN"+i);
		    	 //이벤트 처리
		    	 waterlist[i].addActionListener(new waterbuttonaction());
		    	 //
		    	 waterlist[i].setIcon(Icon2[i]);
		    	 waterlist[i].setPreferredSize(new Dimension(40, 100));
		    	 waterlist[i].setVerticalTextPosition(AbstractButton.BOTTOM);
		    	 waterlist[i].setHorizontalTextPosition(AbstractButton.CENTER);
		    	 waterlist[i].setBackground(Color.white);
		       panel3.add(waterlist[i]);
		     }
		}
		
		add(panel3,BorderLayout.CENTER);
		
		
	}
	void show3() {
	//관리자 버튼	  
		  ImageIcon adminimage =  new ImageIcon("C:/Users/jimon/eclipse-workspace/TEST1226/src/admin.PNG");			
		  JButton adminbutton = new JButton(adminimage);
		  Image originreturn0 = adminimage.getImage(); 
		  Image changereturn0= originreturn0.getScaledInstance(60, 50, Image.SCALE_SMOOTH );
		  ImageIcon return1 = new ImageIcon(changereturn0);
		  adminbutton.setIcon(return1);
		  adminbutton.setContentAreaFilled(false);
		  adminbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			p1 = new password();
            p1.setVisible(true);
				
			}
		});
	// 
          panel4.setBackground(Color.pink);
	      ret.setIcon(return0);
	      panel4.add(ret);
	      panel4.add(adminbutton);
	      add(panel4,BorderLayout.SOUTH);
	}
}

