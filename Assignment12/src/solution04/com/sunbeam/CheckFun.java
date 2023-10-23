
package solution04.com.sunbeam;


public class CheckFun {

	
	@FunctionalInterface
	interface Check<T>{
		abstract boolean compare(T x,T y);
	}
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for(T ele:arr) {
		if(c.compare(ele,key)) {
			count++;
		}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt);

	}

}
