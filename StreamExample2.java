//A program to check if a number exists in a stream
import java.util.stream.Stream;

public class StreamExample2 {
	
	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(30,90,89,78,89,65,46,90,788);
		System.out.println(numberStream.anyMatch(s->(s==99)));
	}

}
