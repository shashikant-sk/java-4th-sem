// Write a program to create class Tower which defines two array named num & loc which hold 5 values each. 
// Then declare interface Mobile which has two abstract methods named getdata() and validateData(). getdata() takes mobile no and location.
//  validateData() validate corresponding mobile no and location (for example, the num[0] and loc[0] are mapped and should be matched). 
//  If not then manage with proper user defined Exception to know which one is not matched.

import java.util.*;
import java.io.*;

class LocationMatchException extends Exception {
    public String error() {
        return "Name doesn't correspond.";
    }
}

class NumberMatchException extends Exception {
    public String error() {
        return "Number doesn't correspond.";
    }
}

interface Mobile {
    abstract void getdata(int i);

    abstract void validateData(String numb, String loca) throws LocationMatchException, NumberMatchException;
}

class Tower implements Mobile {

    Scanner sc = new Scanner(System.in);
    public String num[];
    public String loc[];

    public Tower() {
        num = new String[5];
        loc = new String[5];
    }

    @Override
    public void getdata(int i) {
        System.out.print("Enter mobile number: ");
        this.num[i] = sc.nextLine();
        System.out.print("Enter location: ");
        this.loc[i] = sc.nextLine();
    }

    @Override
    public void validateData(String numb, String loca) throws LocationMatchException, NumberMatchException {
        int numPos = -1;
        int locPos = -1;
        for (int i = 0; i < 5; i++) {
            if (numb.equals(this.num[i])) {
                numPos = i;
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (loca.equals(this.loc[i])) {
                locPos = i;
                break;
            }
        }
        if (numPos == -1)
            throw new NumberMatchException();
        else if (locPos == -1)
            throw new LocationMatchException();
        else
            System.out.println("Number and Location Validated!");

    }
}

public class prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Tower obj = new Tower();
            for (int i = 0; i < 5; i++) {
                System.out.println("Info for Person " + (i + 1));
                obj.getdata(i);
            }
            System.out.print("Enter number to validate: ");
            String num = sc.nextLine();
            System.out.print("Enter location to validate: ");
            String loc = sc.nextLine();
            obj.validateData(num, loc);
        } catch (LocationMatchException e) {
            System.out.println(e.error());
        }
        catch (NumberMatchException e) {
            System.out.println(e.error());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
