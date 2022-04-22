import java.util.*;

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        StringBuffer inputString1 = new StringBuffer(sc.nextLine());

        //Code to change case of string
        StringBuffer tempString = new StringBuffer(inputString1);
        for (int i = 0; i < tempString.length(); i++) {
            char c = tempString.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 32;
                tempString.setCharAt(i, c);
            } else if (c >= 'A' && c <= 'Z') {
                c += 32;
                tempString.setCharAt(i, c);
            }
        }
        System.out.println("Case changed string -> " + tempString);

        //Code to reverse string
        tempString = new StringBuffer(inputString1);
        for (int i = 0, j = tempString.length() - 1; i < j; i++, j--) {
            char c1 = tempString.charAt(i);
            char c2 = tempString.charAt(j);
            tempString.setCharAt(i, c2);
            tempString.setCharAt(j, c1);
        }
        System.out.println("Reversed string -> " + tempString);

        //Code to compare strings
        System.out.print("Enter 2nd string: ");
        StringBuffer inputString2 = new StringBuffer(sc.nextLine());
        System.out.print("Comparing the 2 strings ----> ");
        if (inputString1.length() != inputString2.length())
            System.out.println(inputString1 + " != " + inputString2);
        else {
            Boolean flag = true;
            for (int i = 0; i < inputString1.length(); i++)
                if (inputString1.charAt(i) != inputString2.charAt(i))
                    flag = false;
            if (flag == true)
                System.out.println(inputString1 + " == " + inputString2);
            else
                System.out.println(inputString1 + " != " + inputString2);
        }

        //Code to insert string
        System.out.print("Enter index of 1st string into which 2nd string is to be inserted: ");
        int ind = sc.nextInt();
        tempString = new StringBuffer("");
        for (int i = 0; i <= ind; i++)
            tempString.append(inputString1.charAt(i));
        for (int i = 0; i < inputString2.length(); i++)
            tempString.append(inputString2.charAt(i));
        for (int i = ind + 1; i < inputString1.length(); i++)
            tempString.append(inputString1.charAt(i));
        System.out.println("The inserted string ----> " + tempString);
    }
}

