package exam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class MobileBO {
	
	
	public List<Mobile>findMobile(List<Mobile>mobileList,String modelNAme) {
		List<Mobile> count = new List<Mobile>(); 
		for(Mobile mobile: mobileList) {
			if (mobile.getModelName().equals(modelNAme)) {
				
			}
		}
		
		return null;
		
		
		
	}
	
	
	
	
	public List<Mobile>findMobile(List<Mobile>mobileList,Double displaysize){
		if(((Mobile) mobileList).getDisplaySize().equals(displaysize)) {
			
			
		}
		
		
		return null;
		
		
		
	}

}

	
}
