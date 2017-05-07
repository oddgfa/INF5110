package typesystem;

import syntaxtree.Type;

import java.util.ArrayList;
import java.util.Arrays;

public class TypeChecker {

    private static ArrayList<String> registeredTypes = new ArrayList<>();

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

    public static void registerType(String name) {
        registeredTypes.add(name);
    }

    public static boolean isRegistered(String s) {
        return registeredTypes.contains(s);
    }
}
