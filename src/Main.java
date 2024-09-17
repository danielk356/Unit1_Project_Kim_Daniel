import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take in user inputs
        Scanner s = new Scanner(System.in);
        System.out.print("Number of people: ");
        String people = s.nextLine();
        int numOfPeople = Integer.parseInt(people);
        System.out.print("Bill amount: ");
        String bill = s.nextLine();
        double billAmount = Double.parseDouble(bill);
        System.out.print("Tip percentage: ");
        String tip = s.nextLine();

        //turn the tip percentage into decimal for calculations
        double tipPercentage = Double.parseDouble(tip) / 100.0;

        DecimalFormat toTheFormat = new DecimalFormat("#0.00"); //set up the format

        //calculates all the information needed to be printed.
        double tipAmount = Math.round(billAmount * tipPercentage * 100.0) / 100.0;
        double totalBill = Math.round((tipAmount + billAmount) * 100.0) / 100.0;
        double tipPerPerson = Math.round(tipAmount / numOfPeople * 100.0) / 100.0;
        double totalBillPerPerson = Math.round(totalBill / numOfPeople * 100.0) / 100.0;

        //format the outputs properly
        String tipAmountFormatted = toTheFormat.format(tipAmount);
        String totalBillFormatted = toTheFormat.format(totalBill);
        String tipPerPersonFormatted = toTheFormat.format(tipPerPerson);
        String totalBillPerPersonFormatted = toTheFormat.format(totalBillPerPerson);

        System.out.println("Tip amount: $" + tipAmountFormatted);
        System.out.println("Total bill: $" + totalBillFormatted);
        System.out.println("Tip per person: $" + tipPerPersonFormatted);
        System.out.println("Total bill per person: $" + totalBillPerPersonFormatted);


    }
}