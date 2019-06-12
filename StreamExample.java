//A Program to find first number in a given stream of numbers 
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {
	
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(90,4,9,8,8,6);
		Optional<Integer> anyNumber = stream.findFirst();
		anyNumber.ifPresent(System.out::println);
		
	}

}
