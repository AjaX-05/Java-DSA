package com.dsa_bootcamp_assignments.N_Strings_Problems;

public class c_GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";

        StringBuilder res = new StringBuilder();
        interpret(command, res);

        System.out.println(res);
    }

    static void interpret(String command, StringBuilder p) {
        if (command.isEmpty()) {
//            System.out.println(p);
            return;
        }

        if (command.startsWith("G")) {
            interpret(command.substring(1), p.append("G"));
        } else if (command.startsWith("()")) {
            interpret(command.substring(2), p.append("o"));
        } else if (command.startsWith("(al)")) {
            interpret(command.substring(4), p.append("al"));
        }
    }
}
