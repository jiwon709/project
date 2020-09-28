package action;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class addcoinaction implements ItemListener{
	
	public static int  count[] = {0,0,0,0,0};
     //클릭시 1 클릭안할시 0 으로 배열 저장
	@Override
	public void itemStateChanged(ItemEvent e) {
		if( e.getStateChange() == ItemEvent.SELECTED) {
			System.out.println("zz");
			if(e.getItem().equals("100")) {
			   count[0]=1;
		   }
		   if(e.getItem().equals("500")) {
			   count[1]=1;
		   }
		   if(e.getItem().equals("1000")) {
			   count[2]=1;
		   }
		   if(e.getItem().equals("5000")) {
			   count[3]=1;
		   }
		   if(e.getItem().equals("10000")) {
			   count[4]=1;
		   }
		}
		if( e.getStateChange() == ItemEvent.DESELECTED)  {
			if(e.getItem().equals("100")) {
				   count[0]=0;
			   }
			   if(e.getItem().equals("500")) {
				   count[1]=0;
			   }
			   if(e.getItem().equals("1000")) {
				   count[2]=0;
			   }
			   if(e.getItem().equals("5000")) {
				   count[3]=0;
			   }
			   if(e.getItem().equals("10000")) {
				   count[4]=0;
			   }
		}
	}
}
