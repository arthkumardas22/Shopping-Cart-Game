
import java.util.Scanner;
public class ShoppingCartGame {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String item;
          Double price;
          int quantity;
          String currency="$";
          double total;

          System.out.print("What would you like to Buy? ");
          item=sc.nextLine();

          System.out.print("What is the price for Each item? ");
          price=sc.nextDouble();

          System.out.print("How many would you like? ");
          quantity=sc.nextInt();

          total=price*quantity;

          System.out.println("\nYou have bought "+quantity+" "+item+"/s");
          System.out.println("Your total is "+currency+total);




          sc.close();
    }
    
}
