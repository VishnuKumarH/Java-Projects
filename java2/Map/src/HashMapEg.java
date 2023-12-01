import java.util.*;
import java.util.Map.Entry;
public class HashMapEg {

	public static void main(String[] args) {
	
			HashMap<Integer , String > countryMap = new HashMap<Integer,String>();
			countryMap.put(12,"india");
			countryMap.put(23, "japan");
			countryMap.put(22,"china");
			countryMap.put(22,"russia");
			countryMap.put(21,"france");
			
			
		//	for(Entry<Integer,String> e:countryMap.entrySet()) {
			//	System.out.println(e);
				
			//}
			  // or
			
			Set <Entry<Integer,String>> entries=countryMap.entrySet();
			System.out.println(entries);
			

		}

	}


