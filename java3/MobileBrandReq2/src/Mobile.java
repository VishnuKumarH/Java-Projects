import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Mobile {
private String referenceId,modelName;
private Double displaySize,price;
private Date launcedDate;


public Mobile() {
	
}


public String getReferenceId() {
	return referenceId;
}


public void setReferenceId(String referenceId) {
	this.referenceId = referenceId;
}


public String getModelName() {
	return modelName;
}


public void setModelName(String modelName) {
	this.modelName = modelName;
}


public Double getDisplaySize() {
	return displaySize;
}


public void setDisplaySize(Double displaySize) {
	this.displaySize = displaySize;
}


public Double getPrice() {
	return price;
}


public void setPrice(Double price) {
	this.price = price;
}


public Date getLauncedDate() {
	return launcedDate;
}


public void setLauncedDate(java.util.Date date) {
	this.launcedDate = (Date) date;
}


public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launcedDate) {
	super();
	this.referenceId = referenceId;
	this.modelName = modelName;
	this.displaySize = displaySize;
	this.price = price;
	this.launcedDate = launcedDate;
}
public static Mobile createMobile(String detail) throws ParseException {
	Mobile mobile =new Mobile();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
	String [] arr =detail.split(",");
	mobile.setReferenceId(arr[0]);
	mobile.setModelName(arr[1]);
	mobile.setDisplaySize(Double.valueOf(arr[2]));
	mobile.setPrice(Double.valueOf(arr[3]));
	mobile.setLauncedDate(sdf.parse(arr[4]));
	return mobile;
	
			
			
	
	
}
}