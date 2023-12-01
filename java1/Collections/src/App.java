import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
java.util.Collections;
public class App {
	public static void Main (String []args) {
		List <Product> productList = new ArrayList<>();
		productList.add(new Product(5,"pencil", 12.2,"stationary"));
		productList.add(new Product(6,"sharpener",13.3,"Stationary"));
		productList.add(new Product(7,"eraser",5.0,"ststionary"));
		productList.add(new Product(8,"i phone",100.4,"electronics"));
		productList.add(new Product(9,"charger",60.3,"electronics"));
		
		Collections.sort( productList);

	   for(Product p:productList) {
	   System.out.println(p.toString());
		
	}

}
}
