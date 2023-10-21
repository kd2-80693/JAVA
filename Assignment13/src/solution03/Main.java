package solution03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (FileWriter fout = new FileWriter("file.txt")) {
			try (BufferedWriter bout = new BufferedWriter(fout)) {
				for(int i=1; i<=4; i++) {
					String line = sc.nextLine();
					bout.write(line);
					bout.newLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
