
package solution02.com.sunbeam;

import java.util.function.Predicate;
public class CountString {

	public static int countIf(String[] arr, Predicate<String> cond) {
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
		}
	
	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" ,"Ujjwal Pratap Singh" };
		// call countIf() to count number of strings have length more than 6 -- using anonymous inner class
		System.out.println("BEFORE LAMBDA EXPRESSION**********");
		int cnt = countIf(arr, new Predicate<String>() {
		public boolean test(String s) {
		return s.length() > 6;
		}
		});
		System.out.println("Result: " + cnt); // 2
		// call countIf() to count number of strings have length more than 6 -- using lambda expressions4
		System.out.println("AFTER LAMBDA EXPRESSION***********");
		cnt=countIf(arr, ele->ele.length()>6);
		System.out.println("Result: "+cnt);
		}
	
}
