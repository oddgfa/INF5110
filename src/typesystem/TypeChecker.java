package typesystem;

import syntaxtree.Type;

import java.util.Arrays;

public class TypeChecker {

    static public boolean isOneOf(String type, String[] allowed) {
        return Arrays.asList(allowed).contains(type);
    }

    static public boolean isValid(String left, String right) {
        return left.equals(right);
    }

    public static boolean isValidAssignment(String left, String right) {
        return left.equals(right) || (left.equals("float") && right.equals("int"));
    }

    public static boolean isPrimitive(String returnType) {
        String[] primitives = { "bool", "int", "float", "void", "string" };
        return isOneOf(returnType, primitives);
    }

}
