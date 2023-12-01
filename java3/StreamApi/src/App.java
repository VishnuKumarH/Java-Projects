import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12,23,45,3,67,34,88,89,90,97);
		nums.stream()
		.filter((t)->t>80)
		.sorted()
		.forEach(System.out::println);
		

}
}