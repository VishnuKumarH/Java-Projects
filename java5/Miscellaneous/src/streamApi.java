import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamApi {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,9,2,4,5,7);
		
		
		
		nums.stream().sorted().map(n ->n*2).forEach(n -> System.out.println(n));
		
		
		//Stream <Integer> data =nums.stream();
	//	Stream <Integer> sorted =data.sorted();
		//Stream<Integer> s =sorted.map(n-> n*2);
		//long count = s.count();
		//System.out.println(count);
		//s.forEach(n->System.out.println(n));
	}

}
