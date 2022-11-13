package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthese {

	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));
		// System.out.println(isValid("{{{{{{{"));
		// System.out.println(isValid("({[]})"));
		// System.out.println(isValid("({[}])"));
		// System.out.println(isValid("["));
		// System.out.println(isValid("(){}}{"));
	}

	public static boolean isValid(String s) {
		List<String> str = new ArrayList<>();
		boolean result = false;

		int total = s.length();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			str.add(s.charAt(i) + "");
		}

		if (str.size() % 2 != 0) {
			result = false;
		} else {
			for (int i = 0; i < total / 2; i++) {
				System.out.println(str.size() / 2);
				System.out.println("i : " + i);
				if ((str.get(0).equals("(") && str.get(1).equals(")")) || (str.get(0).equals("{") && str.get(1).equals("}"))
						|| (str.get(0).equals("[") && str.get(1).equals("]"))) {
					System.out.println("여기1?");
					count++;
					str.remove(0);
					System.out.println(str);
					str.remove(0);
					System.out.println(count);
				} else if ((str.get(i).equals("(") && str.get(str.size() - i - 1).equals(")"))
						|| (str.get(i).equals("{") && str.get(str.size() - i - 1).equals("}"))
						|| (str.get(i).equals("[") && str.get(str.size() - i - 1).equals("]"))) {
					System.out.println("여기2?");
					System.out.println("count2 : " + count);
					str.remove(str.size() - i - 1);
					str.remove(i);
					count++;
				}
			}
		}

		if (count > 0) {
			if (count == total / 2)
				result = true;
			else
				result = false;
		} else {
			result = false;
		}

		return result;
	}

}
