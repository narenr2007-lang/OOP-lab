/* Math operations */
import java.util.Scanner;
public class math_operations{
	public static void main(String[] args){
 Scanner myObj = new Scanner(System.in);
 double add, difference, product, division;
 System.out.println("1. Addition");
 System.out.println("2. Product");
 System.out.println("3. Product");
 System.out.println("4. Division");
 int num1 = myObj.nextInt();
 int num2 = myObj.nextInt();
 System.out.println("Enter your choice:");
 String choice = myObj.nextLine();
 if (choice.equals("1")){
 	add = num1+num2;
 	System.out.println("The addition is:"+add);
 }
 else if (choice.equals("2")){
 	difference = num1-num2;
 	System.out.println("The difference is:"+difference);
 }
 else if (choice.equals("3")){
 	product = num1*num2;
 	System.out.println("The product is:"+product);
 }
 else if (choice.equals("4")){
 	division = num1/num2;
 	System.out.println("The division is:"+division);
 }
}
 
}
