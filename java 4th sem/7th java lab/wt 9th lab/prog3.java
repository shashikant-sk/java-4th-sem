import java.util.*;
import java.io.*;

public class prog3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            FileOutputStream fout = new FileOutputStream("output.txt");
            StringBuffer str = new StringBuffer("");
            int i = 0, j = 0;
            while ((i = fin.read()) != -1) {
                str.append((char) i);
            }
            System.out.println("input.txt : " + str);
            for (i = 0, j = str.length() - 1; i < j; i++, j--) {
                char c1 = str.charAt(i);
                char c2 = str.charAt(j);
                str.setCharAt(i, c2);
                str.setCharAt(j, c1);
            }
            System.out.println("output.txt : " + str);
            for (i = 0; i < str.length(); i++) {
                fout.write(str.charAt(i));
            }
            fin.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


