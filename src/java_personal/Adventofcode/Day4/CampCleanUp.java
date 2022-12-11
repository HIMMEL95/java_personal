package java_personal.Adventofcode.Day4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CampCleanUp {

    public static int eachPair() throws  Exception {
        List<String> linesList = Files.readAllLines(Paths.get("./inputs/DAY4/input.txt"));
        String[] linesArr = linesList.toArray(new String[0]);

        List<String> inputArr = new ArrayList<>();
        for (String str : linesArr) {
            String[] line = str.split(", ");
            line[0] = line[0].replace(",","-");
            String[] lines = line[0].split("-");
            inputArr.add(Arrays.toString(lines));
        }

        int fs=0, fe=0, ss=0, se=0, count =0;
        for (int i=0; i< inputArr.size(); i++) {
            String[] str = inputArr.get(i).split(", ");

            fs = Integer.parseInt(str[0].replace("[", ""));
            fe = Integer.parseInt(str[1]);
            ss = Integer.parseInt(str[2]);
            se = Integer.parseInt(str[3].replace("]", ""));

            if (fs>= ss && fe <= se) count++;
            else if (ss >= fs && se <= fe) count++;
        }
        return count;
    }

    public static int partTwo() throws Exception {
        List<String> linesList = Files.readAllLines(Paths.get("./inputs/DAY4/input.txt"));
        String[] linesArr = linesList.toArray(new String[0]);

        List<String> inputArr = new ArrayList<>();
        for (String str : linesArr) {
            String[] line = str.split(", ");
            line[0] = line[0].replace(",","-");
            String[] lines = line[0].split("-");
            inputArr.add(Arrays.toString(lines));
        }

        int fs=0, fe=0, ss=0, se=0, count =0;
        for (int i=0; i< inputArr.size(); i++) {
            String[] str = inputArr.get(i).split(", ");

            fs = Integer.parseInt(str[0].replace("[", ""));
            fe = Integer.parseInt(str[1]);
            ss = Integer.parseInt(str[2]);
            se = Integer.parseInt(str[3].replace("]", ""));

            if ((fs <= ss && fe >= ss) || (fs <= se && fe >= se)) count++;
            else if ((ss <= fs && se >= fs) || (ss <= fe && se >= fe)) count++;
        }
        return count;
    }

    public static void main (String[] args) throws Exception {
        System.out.println(eachPair());
        System.out.println(partTwo());
    }
}
