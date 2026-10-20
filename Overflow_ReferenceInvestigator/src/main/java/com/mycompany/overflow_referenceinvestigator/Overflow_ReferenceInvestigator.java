/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overflow_referenceinvestigator;

/**
 *
 * @author joshua
 */
public class Overflow_ReferenceInvestigator {
    public static void main(String[] args) {

        System.out.println("== Byte Overflow ==");

        byte number = 127;
        System.out.println("Before increment: " + number);

        number++;
        System.out.println("After increment: " + number);


        System.out.println("\n== String Comparisons ==");

        String name1 = new String("Joshua");
        String name2 = new String("Joshua");
        String name3 = "Joshua";

        // False because name1 and name2 are different objects.
        System.out.println(name1 == name2);

        // True because both contain the same name.
        System.out.println(name1.equals(name2));

        // False because name1 and name3 are different objects.
        System.out.println(name1 == name3);

        // True because both contain the same name.
        System.out.println(name1.equals(name3));

        // False because name2 and name3 are different objects.
        System.out.println(name2 == name3);

        // True because both contain the same name.
        System.out.println(name2.equals(name3));


        System.out.println("\n== Shared Array Reference ==");

        int[] numbers1 = {10, 20, 30};
        int[] numbers2 = numbers1;

        System.out.println("Before modification: " + numbers2[0]);

        numbers1[0] = 99;

        // Both variables refer to the same array.
        System.out.println("After modification: " + numbers2[0]);
    }
}
