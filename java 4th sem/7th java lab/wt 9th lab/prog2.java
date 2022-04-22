import java.util.*;

public class prog2 {

    public static void exchangeChar(StringBuffer str, int i, int j) {
        char c = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuffer inputString = new StringBuffer(sc.nextLine());
        exchangeChar(inputString, 0, 1);
        exchangeChar(inputString, 3, 5);
        exchangeChar(inputString, 5, 6);
        exchangeChar(inputString, 8, 10);
        exchangeChar(inputString, 8, 11);
        for (int i = 3; i < 7; i++)
            exchangeChar(inputString, i, i + 5);
        System.out.println("The output string: " + inputString);
    }
}


