package week1.day1;

public class Mobile {


		public void makeCall(String mobileModel, float mobileWeight) {
			System.out.println("My mobile Model is "+ mobileModel);
			System.out.println("My Mobile weight is "+mobileWeight);
		}
		public void sendMsg(boolean isFullCharged ,int mobileCost) {
			System.out.println("Phone is fully charged "+isFullCharged);
			System.out.println("Mobile cost is "+mobileCost);
		}
		
		
		public static void main(String[] args) {

			Mobile m =new Mobile();
			m.makeCall("Redmi", 50.5f);
			m.sendMsg(true, 18000);
	        System.out.println("This is my mobile");
			
			
		}

	}

