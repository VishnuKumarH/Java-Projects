
public class Product implements Comparable<product> {
	private Integer id;
	private String name;
	private Double price;
	private String Category;
	
	
public void product() {
	
}
public Product(Integer id, String name, Double price, String category) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	Category = category;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
@Override
public int compareTo(Product arg) {
	// TODO Auto-generated method stub
	return this.name.compareTo(arg.name);;
}




}
