package solution04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (FileReader fr = new FileReader("file.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while( (line = br.readLine() )!= null)
				{
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
