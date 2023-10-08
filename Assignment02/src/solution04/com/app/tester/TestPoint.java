package solution04.com.app.tester;

import java.util.Scanner;

import solution04.com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.print("Enter x :");
		x = sc.nextInt();
		System.out.print("Enter y :");
		y = sc.nextInt();
		Point2D p1 = new Point2D(x, y);

		System.out.print("Enter x :");
		x = sc.nextInt();
		System.out.print("Enter y :");
		y = sc.nextInt();
		Point2D p2 = new Point2D(x, y);

		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	
		if(p1.isEqual(p2))
			System.out.println(" Equal");
		else {
			System.out.println(" not Equal");
			System.out.println(p1.calculateDistance(p2));
		}
		sc.close();
		
	}

}
