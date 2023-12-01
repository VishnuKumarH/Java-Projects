
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StringInput {

	public static void main(String[] args) {
	   String str ="This sentence is typed by me .You are going to work on this";
	   str = str.replace(" ", "");
	   str=str.replace(".", "");
	   char[] ch = str.toCharArray();
	   List<Character> cList = new ArrayList<>();
	   for(char c :ch) {
		   cList.add(c);
		   
		   
	   }

	  //  c list is collection of characters
	   
	   Map<Character,Long> result = cList.stream()
			   .collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));
	   for(Entry<Character,Long> e : result.entrySet())
		   System.out.println(e);
			   
	}

}
