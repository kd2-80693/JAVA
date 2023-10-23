package solution07.com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class RandomSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Stream<Integer> strm= Stream.generate(()->r.nextInt(10)).limit(10);
		int res=strm.reduce(0, (a,b)->a+b);
		System.out.println("Result: "+res);
	}

}
