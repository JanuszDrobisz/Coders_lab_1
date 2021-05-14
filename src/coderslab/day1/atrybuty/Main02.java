package coderslab.day1.atrybuty;

import coderslab.day1.atrybuty.AccessModifier;

public class Main02 {
    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        String  testAt01 = testAttribute.publicAttribute;
        String testAt02 = testAttribute.protectedAttribute;
        System.out.println(testAt01);
        System.out.println(testAt02);
    }
}
