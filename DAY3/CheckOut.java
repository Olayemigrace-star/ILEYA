import java.util.Scanner;
import java.util.ArrayList;

public class CheckOut{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("What is the customers name: ");
        String customer = input.nextLine();
        String decision = "";
        ArrayList<String> productName = new ArrayList<>();
        ArrayList<Integer> productUnit = new ArrayList<>();
        ArrayList<Double> costPrice = new ArrayList<>();
               
        while(!decision.equals("no")){
            
            System.out.println("What did the user buy: ");
            String product = input.nextLine();
            productName.add(product);

            System.out.println("How many pieces: ");
            int unit = input.nextInt();
            productUnit.add(unit);

            System.out.println("How much per unit: ");
            double price = input.nextDouble();
            costPrice.add(price);
            input.nextLine();
            System.out.println("Add more items: ");
            decision = input.nextLine();
            
        }
        
        System.out.println("What is your name: ");
        String cashiersName = input.nextLine();
        System.out.println("How much discount will he get: ");
        double discount = input.nextDouble();
        System.out.println();


    System.out.printf("SEMICOLON STORES%nMAIN BRANCH%nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABO, LAGOS.%nTEL: 03293828343%nDate : 18-Dec-22 8:48:11 pm%nCashier: %s %nCustomer's Name: %s%n%n", cashiersName,customer);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-15s%-14s%-14s%-14s%-14s%n","","ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.printf("  -----------------------------------------------------------------------%n");
    for(int counter = 0; counter < productName.size(); counter++){

        System.out.printf("%-15s%-14s%-14d%-14.2f%-14.2f%n", "", productName.get(counter), productUnit.get(counter), costPrice.get(counter), costPrice.get(counter) * productUnit.get(counter));

    }
    System.out.printf("%n  -----------------------------------------------------------------------%n");
    double total = 0;
    for(int counter = 0; counter < productName.size(); counter++){

        total = total + costPrice.get(counter) * productUnit.get(counter);

    }
    discount = (discount/100.0) * total;
    double vat = (17.50/100.0) * total;
    double billTotal = total - discount + vat;    

    System.out.printf("%-29s%-16s%.2f%n","","Sub Total:",total);
    System.out.printf("%-29s%-16s%.2f%n","","Discount:",discount);
    System.out.printf("%-29s%-16s%.2f%n","","VAT @ 17.50%:",vat);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-29s%-16s%.2f%n","","Bill Total:",billTotal);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-4sTHIS IS NOT A RECEIPT KINDLY PAY %.2f%n","",billTotal);
    System.out.printf("  =======================================================================%n%n");

    System.out.println("How much did the customer give to you?");
    double amountPayed = input.nextDouble();
    System.out.println();


    System.out.printf("SEMICOLON STORES%nMAIN BRANCH%nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABO, LAGOS.%nTEL: 03293828343%nDate : 18-Dec-22 8:48:11 pm%nCashier: %s %nCustomer's Name: %s%n%n", cashiersName,customer);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-15s%-14s%-14s%-14s%-14s%n","","ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.printf("  -----------------------------------------------------------------------%n");
    for(int counter = 0; counter < productName.size(); counter++){

        System.out.printf("%-15s%-14s%-14d%-14.2f%-14.2f%n","", productName.get(counter), productUnit.get(counter), costPrice.get(counter), costPrice.get(counter) * productUnit.get(counter));

    }
    System.out.printf("%n  -----------------------------------------------------------------------%n");
    //double total = 0;
    for(int counter = 0; counter < productName.size(); counter++){

        total = total + costPrice.get(counter) * productUnit.get(counter);

    }
    discount = (discount/100.0) * total;
    double balance = amountPayed - billTotal;

    System.out.printf("%-29s%-16s%.2f%n","","Sub Total:",total);
    System.out.printf("%-29s%-16s%.2f%n","","Discount:",discount);
    System.out.printf("%-29s%-16s%.2f%n","","VAT @ 17.50%:",vat);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-29s%-16s%.2f%n","","Bill Total:",billTotal);
    System.out.printf("%-29s%-16s%.2f%n","","Amount Paid:",amountPayed);
    System.out.printf("%-29s%-16s%.2f%n","","Balance:",balance);
    System.out.printf("  =======================================================================%n");
    System.out.printf("%-15sTHANK YOU FOR YOUR PATRONAGE%n","");
    System.out.printf("  =======================================================================%n%n");


    }
    
}
