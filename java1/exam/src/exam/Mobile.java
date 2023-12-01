package exam;


import java.sql.Date;
import java.text.SimpleDateFormat;

public class Mobile {
	private String referenceId;
	private String modelName;
	private Double displaySize,price;
	private Date launchedDate;
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
	public Date getLaunchedDate() {
		return launchedDate;
	}
	public void setLaunchedDate(java.util.Date date) {
		this.launchedDate = (Date) date;
	}
	
	public Mobile (){
		
	}
	public Mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		return String.format("%-15s %-15s %-12s %-8s %s\n",getReferenceId(),getModelName(),getDisplaySize(), getPrice(),sdf.format(getLaunchedDate()));
	
	}
	
	
	
}
