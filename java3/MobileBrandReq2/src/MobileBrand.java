import java.util.ArrayList;

public class MobileBrand {
	private String name;
	
	ArrayList<Mobile> mobileList = new ArrayList<Mobile>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Mobile> getMobileList() {
		return mobileList;
	}

	public void setMobileList(ArrayList<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
//public MobileBrand() {
	
//}

public MobileBrand(String name, ArrayList<Mobile> mobileList) {
	super();
	this.name = name;
	this.mobileList = mobileList;
}
public MobileBrand() {
	mobileList=new ArrayList<Mobile>();
			
}
public void addMobileToMobileBrand(Mobile mobile)
{
	mobileList.add(mobile);
}

}
