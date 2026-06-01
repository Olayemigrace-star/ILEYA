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
               
        while(true){
            
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
            
            if(decision.equals("no")) break;
            
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

    }
    }
