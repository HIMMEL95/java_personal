package java_personal.Adventofcode.Day2;

import java.io.BufferedReader;
import java.io.FileReader;

public class RockScissorsPaper{
	
	private String A,X = "Rock";
	private String B,Y = "Paper";
	private String C,Z = "Scissors";
	
	public static void read() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("./src/java_personal/Adventofcode/Day2/input.txt"));
		
		String str;
		int score = 0;
		while ((str = reader.readLine()) != null) {
			String[] game = str.split(" ");
			System.out.println(game[0]);
			System.out.println(game[1]);
			System.out.println(str);
		}
		
		reader.close();
	}
	
	public static void main (String[] args) throws Exception {
		read();
	}
}
