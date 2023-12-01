package req6Mock21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		System.out.println("Enter the number of purchases :");
		Scanner sc = new Scanner(System.in);
		int noOfPurchases = sc.nextInt();
		List<Purchase> purchaseList = new ArrayList<>();
		List<User> userList = User.prefill();
		for(int i=0;i<noOfPurchases;i++) {
			
			String detail= sc.nextLine();
			String [] arr = detail.split(",");
			if(detail.equals("")) {
				detail=sc.nextLine();
				//1,750,FIRST,05-06-2018,Rob
				Purchase purchase = new Purchase();
				purchase.setId(Integer.parseInt(arr[0]));
				purchase.setPrice(Double.parseDouble(arr[1]));
				purchase.setCouponCode(arr[2]);
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
				purchase.setPurchaseDate(sdf.parse(arr[3]));
				String userName = arr[4];
				
				for(User user :userList) {
					
					if(user.equals(userName)) {
						
						purchase.setUser(user);
						user.getPurchaseList().add(purchase);
						
				
			}

				}
				purchaseList.add(purchase);
				
			}
			System.out.println("enter month");
			String month  = sc.nextLine();
			User result = User.getValuableUser(userList, month);
			System.out.println("the valuable user of the month");
			
		}

	}

}
