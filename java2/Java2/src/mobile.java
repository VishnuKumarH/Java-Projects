import java.text.SimpleDateFormat;
import java.util.Date;

public class mobile {
	private String referenceId;
	private String modelName;
	private Double displaySize;
	private Double price;
	private Date launchedDate;
	
	public mobile() {}

	public mobile(String referenceId, String modelName, Double displaySize, Double price, Date launchedDate) {
		super();
		this.referenceId = referenceId;
		this.modelName = modelName;
		this.displaySize = displaySize;
		this.price = price;
		this.launchedDate = launchedDate;
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

	public Date getLaunchedDate() {
		return launchedDate;
	}

	public void setLaunchedDate(Date launchedDate) {
		this.launchedDate = launchedDate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return String.format("Reference Id: %s\nModel Name: %s\nDisplay Size: %f\nPrice: %.1f\nLaunched Date: %s",referenceId,modelName,displaySize,price,sdf.format(launchedDate));
	}


	public boolean equals(mobile arg) {
		return this.getReferenceId().equals(arg.getReferenceId()) && this.getModelName().equalsIgnoreCase(arg.getModelName());
	}
	
	

}
