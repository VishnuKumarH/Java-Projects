import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private String email;
	private String phoneNumber;
	private String location;
	private static List<Purchase> purchaseList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Purchase> getPurchaseList() {
		return purchaseList;
	}
	public void setPurchaseList(List<Purchase> purchaseList) {
		this.purchaseList = purchaseList;
	}
	public User(String name, String email, String phoneNumber, String location, List<Purchase> purchaseList) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.purchaseList = purchaseList;
	}
	
	public User() {
		
	}
	
	static List<User>prefil(){
		List<User> userList=new ArrayList<>();
		userList.add(new User("Harry","harry@gmail.com","9856231478","NewYork", new ArrayList<Purchase>()));
		userList.add(new User("Joe","joe@gmail.com","8956231548","Chicago", new ArrayList<Purchase>()));
		userList.add(new User("Oliver","oliver@gmail.com","7856124589","SanFrancisco", new ArrayList<Purchase>()));
		userList.add(new User("Danny","danny@gmail.com","9382714568","Los Angeles", new ArrayList<Purchase>()));
		userList.add(new User("Brandon","brandon@gmail.com","98596215488","Boston", new ArrayList<Purchase>()));
		userList.add(new User("Rob","rob@gmail.com","9584596662","NewYork", new ArrayList<Purchase>()));
		
		
		return null;
		
		
	}
	static User getValuableUser(List<User>userList,String currentmonth) {
		
		for(User user:userList) {
			for(Purchase purchase:purchaseList) {
				SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
				String month = sdf.format(purchase.getPurchaseDate());
				if(currentmonth.equals(month)) {
					
				}
				
				
			}
		}
		
		
		return null;
		
	}

}
