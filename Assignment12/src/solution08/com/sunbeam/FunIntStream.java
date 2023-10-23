package solution08.com.sunbeam;

import java.util.stream.IntStream;
public class FunIntStream {

	public static void main(String[] args) {
		IntStream str1=IntStream.range(1,100);
		System.out.println(str1.sum()); 
		IntStream str2=IntStream.range(1,100);
		System.out.println(str2.summaryStatistics());
	}
}
