package java_personal.Adventofcode.Day6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TuningTrouble {

    public static int partOne() throws Exception {
        List<String> linesList = Files.readAllLines(Paths.get("./inputs/DAY6/input.txt"));
        String[] linesArr = linesList.toArray(new String[0]);
        System.out.println(Arrays.toString(linesArr));
        return 1;
    }

    public static void main(String[] args) throws Exception{
        partOne();
    }
}
