package java_personal.Adventofcode.Day5;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SupplyStacks {

    public static int partOne() throws Exception {
        List<String> linesList = Files.readAllLines(Paths.get("./inputs/DAY5/input.txt"));
        String[] linesArr = linesList.toArray(new String[0]);

        System.out.println(Arrays.toString(linesArr));

        return 1;
    }

    public static void main(String[] args) throws Exception{
        System.out.println(partOne());
    }
}
