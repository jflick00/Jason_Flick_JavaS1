package com.company;

import java.util.Scanner;

public class IsJavaKeyword {

    public static void main(String[] args) {
        // Allows the user to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Type in any word to see if it is a Java keyword.");

        // Grabs the user's input
        String keyword = myScanner.nextLine();

        // Switch statement containing all the Java keywords. Will default if user's word
        // doesn't match any of the following listed
        switch (keyword) {
            case "abstract":
            case "assert":
            case "boolean":
            case "break":
            case "byte":
            case "case":
            case "catch":
            case "char":
            case "class":
            case "const":
            case "continue":
            case "default":
            case "do":
            case "double":
            case "else":
            case "enum":
            case "extends":
            case "final":
            case "finally":
            case "float":
            case "for":
            case "goto":
            case "if":
            case "implements":
            case "import":
            case "instanceof":
            case "int":
            case "interface":
            case "long":
            case "native":
            case "new":
            case "package":
            case "private":
            case "protected":
            case "public":
            case "return":
            case "short":
            case "static":
            case "strictfp":
            case "super":
            case "switch":
            case "synchronized":
            case "this":
            case "throw":
            case "throws":
            case "transient":
            case "try":
            case "void":
            case "volatile":
            case "while":
                System.out.println("This is a Java keyword.");
                break;
            default:
                System.out.println("This is not a Java keyword.");
        }

    }
}
