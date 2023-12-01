import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		System.out.println("enter the number of purchases");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Purchase> purchaseList = new ArrayList<>();
		List<User> userList = User.prefil()	;
		for(int i=0;i<n;i++) {
			String detail = sc.nextLine();
			if(detail.equals("")) {
				detail = sc.nextLine();
				//1,750,FIRST,05-06-2018,Ro
				String []arr= detail.split(",");
	               Purchase purchase = new Purchase();
	               purchase.setId(Integer.parseInt(arr[0]));
	               purchase.setPrice(Double.parseDouble(arr[1]));
	               purchase.setCouponCode(arr[2]);
	               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	               purchase.setPurchaseDate((Date)sdf.parse(arr[3]));
	              
	               String Username= arr[4];
	               for(User user:userList)
	               {
	            	   if (user.getName().equals(Username)) 
	            		   purchase.setUser(user);
	            		   user.getPurchaseList().add(purchase);
	            		   break;
	            	   
	               }
	               
	            purchaseList.add(purchase);      
			}
			
			System.out.println("enter the month");
			String month = sc.nextLine();
			User result = User.getValuableUser(userList, month);
			if(result!=null) {
				System.out.println("the valuble user of the month "+month+ "is"+);
			}
			
			
		}
		
		
	}

}