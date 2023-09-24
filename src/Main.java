import java.util.Scanner;

public class Main {
    //num itemPrice = 0
    //		num shippingCost = 0
    //		num totalPrice = 0
    //
    //		output "Please enter the price of your item: "
    //		input itemPrice
    //
    //		if itemPrice >= 100 then
    //			output "Shipping is free! Your total cost is " + itemPrice
    //
    //		else
    //			shippingCost = itemPrice * .2
    //			totalPrice = shippingCost + itemPrice
    //			output "The cost of shipping is " + shippingCost + "your total cost is " + totalCost
    //
    //		endIF
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double itemPrice = scanner.nextDouble();

        double shippingCost;

        if (itemPrice >= 100.0){
            shippingCost = 0.0;
        }

        else{
            shippingCost = 0.02 * itemPrice;
        }

        double totalPrice = itemPrice + shippingCost;

        System.out.println("The cost of shipping is: " + shippingCost);
        System.out.println("The total cost is: "+ totalPrice);

        scanner.close();

    }
}