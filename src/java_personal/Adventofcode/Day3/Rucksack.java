package java_personal.Adventofcode.Day3;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Rucksack {

	public static int sumOfCommonCharacter() throws Exception {
		List<String> lineList = Files.readAllLines(Paths.get("./inputs/DAY3/input.txt"));
		String[] linesArray = lineList.toArray(new String[0]);

		Map<Character, Integer> lowercase = new HashMap<>();
		Map<Character, Integer> uppercase = new HashMap<>();

		for (int i=1; i<27; i++) {
			lowercase.put((char) (96 + i), i);
			uppercase.put((char) (64 + i), i+26);
		}

		List<Integer> count = new ArrayList<>();

		int sum = 0;
		for (String line : linesArray) {
			String left = line.substring(0, line.length() / 2);
			String right = line.substring(line.length() / 2);

			for (int i = 0; i < left.length(); i++) {
				String str = Character.toString(right.charAt(i));
				if (left.contains(str)) {
					if (Character.isUpperCase(str.charAt(0))) {
						count.add(uppercase.get(str.charAt(0)));
					} else {
						count.add(lowercase.get(str.charAt(0)));
					}
					break;
				}
			}
		}

		for (Integer integer : count) {
			sum += integer;
		}
		return sum;
	}

	public static String[] Reorganization() throws Exception {
		List<String> lineList = Files.readAllLines(Paths.get("./inputs/DAY3/input.txt"));
		String[] linesArray = lineList.toArray(new String[0]);

		Map<Character, Integer> lowercase = new HashMap<>();
		Map<Character, Integer> uppercase = new HashMap<>();

		for (int i=1; i<27; i++) {
			lowercase.put((char) (96 + i), i);
			uppercase.put((char) (64 + i), i+26);
		}

		List<String> listArr = new ArrayList<>();

		for (int i=0; i< linesArray.length; i++) {
			Set<Character> set = new LinkedHashSet<>();
			for (int j=0; j<linesArray[i].length(); j++) {
				set.add(linesArray[i].charAt(j));
			}

			String str = "";
			for (Character a : set) {
				str += Character.toString(a);
			}
			listArr.add(str);
		}

		for (int i=0; i<listArr.size(); i+=3) {
			Set<Character> set = new LinkedHashSet<>();
 			String same2 = "";
			for (int j=0; j<listArr.get(i+1).length(); j++) {
				String str = Character.toString(listArr.get(i+1).charAt(j));
				if (listArr.get(i).contains(str)) {
					set.add(str.charAt(0));
				}
			}

			System.out.println(set);
			for (int j=0; j< listArr.get(i+2).length(); j++) {
				String str = Character.toString(listArr.get(i+2).charAt(j));
				if (set.contains(str) == true) {
					same2 = str;
					System.out.println(same2);
				}
			}
		}
		return linesArray;
	}

	public static void main(String[] args) throws Exception {
//		System.out.println(sumOfCommonCharacter());

		Reorganization();
	}

}
