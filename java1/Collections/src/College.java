import java.sql.Date;

public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private String numberOfDepartment;
	private String location;
	private Date StartingDate;
	
	
	public void  college() {
		
	}


	public College(String name, String website, String mobile, String founder, String numberOfDepartment,
			String location, Date startingDate) {
		super();
		this.name = name;
		this.website = website;
		this.mobile = mobile;
		this.founder = founder;
		this.numberOfDepartment = numberOfDepartment;
		this.location = location;
		StartingDate = startingDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getFounder() {
		return founder;
	}


	public void setFounder(String founder) {
		this.founder = founder;
	}


	public String getNumberOfDepartment() {
		return numberOfDepartment;
	}


	public void setNumberOfDepartment(String numberOfDepartment) {
		this.numberOfDepartment = numberOfDepartment;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getStartingDate() {
		return StartingDate;
	}


	public void setStartingDate(Date startingDate) {
		StartingDate = startingDate;
	}
	

}
