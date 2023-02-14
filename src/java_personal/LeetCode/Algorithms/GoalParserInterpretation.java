package java_personal.LeetCode.Algorithms;

class GoalParserInterpretation { 

    public static String interpret(String command) {
        
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }

    public static void main(String[] args) {

        String command = "G()(al)";
        System.out.println(interpret(command));

        String a = "G()()()()(al)";
        System.out.println(interpret(a));

        String b = "(al)G(al)()()G";
        System.out.println(interpret(b));
    }
}

