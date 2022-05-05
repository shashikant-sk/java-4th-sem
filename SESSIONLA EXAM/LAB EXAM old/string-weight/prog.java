// Write a program that takes input as string and calculate the weight of the string as per the following rules:
// • Weight of all alphabetic characters that appears in the string should be added.
// • Weight of vowels should be ignored.
// • Non alphabetic character in the string should be ignored.
// Ex: Hello World =8+0+12+12+0+0+23+0+18+12+4=89

import java.util.*;
import java.io.*;

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int wt = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
                c += 32;
            if (c >= 'a' && c <= 'z') {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    wt += c - 97 + 1;
                }
            }
        }
        System.out.println("Weight of \"" + str + "\" = " + wt);
    }
}
