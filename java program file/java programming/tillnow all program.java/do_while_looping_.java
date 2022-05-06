import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
	   
        Double number, sum = 0.0;
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {

            // takes input from the user
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        } while (number != 0.0);  // test expression
	   
        System.out.println("Sum = " + sum);
    }
}