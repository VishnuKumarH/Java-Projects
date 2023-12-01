
public class UserMainCode {

	public  static String getCombo(String a,String b) {
		 int k = a.length();
		 int p = b.length();
				 
		 if(k>p) {
			return(a +b +a);
		 }else {
			 return(b+a+b);
		 }
				 
	 }
}
