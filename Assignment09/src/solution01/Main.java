package solution01;

public class Main {

static <T extends Number> T findMin(T [] arr) {
		T min = arr[0];
		for(T n : arr)
		{
			if(n.doubleValue()<min.doubleValue())
				min = n;
		}
		return min;
	}

public static void main(String[] args) {
	
	Integer [] arr1 = {1,6,4,89,2};
	Integer min1 = findMin(arr1);
	System.out.println("Min in Integer array = "+min1);
	
	Double [] arr2 = {3.4,7.9,97.5,2.4,1.1};
	Double min2 = findMin(arr2);
	System.out.println("Min in Double array = "+min2);
	
//  Below will give compilation error as method only extends Number
//	String [] arr3 = {"hi","one"};
//	String min3 = findMin(arr3);
	}
}
