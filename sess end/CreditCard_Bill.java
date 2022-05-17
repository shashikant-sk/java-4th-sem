

class CreditCard_Bill {
    long creditCardNumber;
    int cutomer_id;
    //date in mm/dd/yyyy format
    String billDate;
    String customerName;
    double transactions[] = new double[5];

    CreditCard_Bill(long creditCardNumber, int cutomer_id, String billDate, String customerName,
            double transactions[]) throws InvalidDataException {
        if (!validateDate()) {
            throw new InvalidDataException("Invalid data");
        }
        this.creditCardNumber = creditCardNumber;
        this.cutomer_id = cutomer_id;
        this.billDate = billDate;
        this.customerName = customerName;
        this.transactions = transactions;
    }

    void get_CreditCardDetails() {
        System.out.println("Credit Card Number: " + creditCardNumber);
        System.out.println("Cutomer ID: " + cutomer_id);
        System.out.println("Bill Date: " + billDate);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Transactions: ");
        for (int i = 0; i < transactions.length; i++) {
            System.out.println(transactions[i]);
        }
    }

    void getTotalAmmount() {
        double total = 0;
        for (int i = 0; i < transactions.length; i++) {
            total += transactions[i];
        }
        System.out.println("Total Amount: " + total);
    }

    Boolean validateDate() {
        // check if the credit card number is 16 digits
        if (creditCardNumber > 9999999999999999 || creditCardNumber < 1000000000000000) {
            //check if the Name doesnt contain a digit
            if (customerName.matches(".*\\d+.*")) {
                return false;
            }
            //check bill date should be in  mm-dd-yyyy format
            else if (billDate.matches("\\d{2}-\\d{2}-\\d{4}")) {
                return true;
            }
        } else {
            return false;
        }
    }
}

//exception to be thrown in case validateData returns false
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}