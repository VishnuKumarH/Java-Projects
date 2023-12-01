import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class College {
	private String name;
	private String website;
	private String mobile;
	private String founder;
	private Integer numberOfDepartment;
	private String location;
	private Date StartingDate;
	
	
	public void  college() {
		
	}


	public College(String name, String website, String mobile, String founder, Integer numberOfDepartment,
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


	public College() {
		// TODO Auto-generated constructor stub
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


	public Integer getNumberOfDepartment() {
		return numberOfDepartment;
	}


	public void setNumberOfDepartment(Integer integer) {
		this.numberOfDepartment = integer;
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


	public void setStartingDate(java.util.Date date) {
		StartingDate = (Date) date;
	}
	public static College createCollege(String detail) throws ParseException{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		String[] arr1=s1.split(",");
		College college1=new College();
		college1.setName(arr1[0]);
		college1.setWebsite(arr1[1]);
		college1.setMobile(arr1[2]);
		college1.setFounder(arr1[3]);
		college1.setNumberOfDepartment(Integer.valueOf(arr1[4]));
	    college1.setLocation(arr1[5]);
		college1.setStartingDate(sdf.parse(arr1[6]));
		 return college1;
	}

	

}

