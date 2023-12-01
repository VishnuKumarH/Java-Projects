package exam;

public class item implements Comparable <item>{
	private String name;
	private Double price;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double arr) {
		this.price = arr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public item () {
		
	}
	public item(String name, Double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	static item createItem(String detail) {
		String [] arr = detail.split(",");
		item item1 = new item();
		item1.setName(arr[0]);
		item1.setPrice(Double.valueOf(arr[1]));
		item1.setType(arr[2]);
		return null;
	}
	@Overide
	public int compareTo(item o1,item o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

     
		
	
	
	
	
}


