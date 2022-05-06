import java.util.*;

class CountFrequecy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array.");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the numbers in an array.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] checkRepitition = new int[n];
        for (int i = 0; i < n; i++) {
            checkRepitition[i] = 0;
        }

        System.out.println("");
        for (int i = 0; i < n; i++) {
            int numCount = 1;
            if (checkRepitition[i] == 1)

                continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    checkRepitition[j] = 1;
                    numCount++;
                }
            }
            System.out.println("Frequency of " + arr[i] + " is " + numCount + ".");

        }
    }
}