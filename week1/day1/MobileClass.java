package week1.day1;

public class MobileClass {
	
	
	
	/**Create Class Mobile
Create methodName
1.sendSms
print type some txt message
2.takeSnapshot
print type some txt 
Create object for Mobile Class and call two method then run the code
Class Tab
call all the methods in Tab class
	 **/
			public void sendsms(String hi) {
			System.out.println(hi);
		}
			public String takeSnapshot(String snap) {
				return snap;
	}
			public static void main(String[] args) {
				MobileClass m = new MobileClass();
				m.sendsms("Hi");
				System.out.println(m.takeSnapshot("snap"));
			}
}



/** 
Doubt session format 

public void makeCall(String mobileModel , float mobileWeight) {
       
      System.out.println("my mobile model" + mobileModel );
  
      System.out.println("my mobile weight"+ mobileWeight); 
      
  }

public void sendMsg(boolean isFullCharged ,int mobileCost) {
       
   
      System.out.println(isFullCharged);
      System.out.println("my mobile cost" + mobileCost);
  }
  public static void main(String[] args) {
      Mobile n= new Mobile();
     
      Mobile.makeCall("Redmi", 65.5f);
      
      Mobile.sendMsg(true, 18000);
      System.out.println("This is my mobile");
  }
}
	
**/