import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.text.SimpleDateFormat;
public class University extends College{
	private String name;

		ArrayList<String> college = new ArrayList<String>();

		private String collegeList;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<String> getCollege() {
			return college;
		}

		public void setCollege(ArrayList<String> college) {
			this.college = college;
		}
		
		public University(String name,String collegeList) {
			super();
			this.name=name;
			this.collegeList=collegeList;
			
			
		}
}
	
	
	


