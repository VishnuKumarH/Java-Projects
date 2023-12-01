import java.util.ArrayList;
import java.util.List;


public class ReplaceTens {

	public static void main(String[] args) {
		int limit=5;
		int []arr = {1,10,20,10,2};
		int k=0;
			List<Integer> list = new ArrayList<>();
			
			for(int i=0;i<limit;i++) {
				
				if(arr[i]!=10) {
					list.add(arr[i]);
				
				
			
		}
				
			}while(list.size()!=limit) {
				list.add(0);
				
			}
			System.out.println(list);
			}
			
	}




