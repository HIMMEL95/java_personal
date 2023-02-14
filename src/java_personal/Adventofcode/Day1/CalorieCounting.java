package java_personal.Adventofcode.Day1;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalorieCounting {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("./inputs/DAY1/input.txt"));
        List<Integer> result = new ArrayList<Integer>();

        String str;
        int sum = 0;
        while((str = reader.readLine()) != null) {
            if (!str.equals("")) {
                sum += Integer.parseInt(str);
            } else {
                result.add(sum);
                sum = 0;
            }
        }
        result.sort(Comparator.reverseOrder());
        /*Collections.sort(result, Collections.reverseOrder());*/
        System.out.println(result.get(0) + result.get(1) + result.get(2));
        reader.close();
    }
}
