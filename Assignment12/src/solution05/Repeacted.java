
package solution05;


public class Repeacted {

	interface Check<T>{
		abstract boolean compare(T x,T y);
	}
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count=0;
		for(T ele:arr) {
		if(c.compare(key,ele)) {
			count++;
		}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] d1= {44.0, 77.0, 99.0, 22.0, 55.0, 66.0,77.0,44.0,23.0,23.0,44.0,44.0,44.0};
		Double key=44.0;
		
		System.out.println("approch using .equal method");
		int x=countIf(d1, key, (a,b)->a.equals(b));
		System.out.println("total count: "+x);
		System.out.println("Approch using -(minus) operator");
		int count=countIf(d1,key,(a,b)->a-b==0);
		System.out.println("Total Count: "+count);

	}

}
