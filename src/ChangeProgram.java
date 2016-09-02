
import java.util.Scanner;
public class ChangeProgram {

		 public static void main(String[] args) {
		 Scanner keyboard = new Scanner(System.in);
		 
		 String firstInitial,lastName, houseNumber,streetName,streetType,city;
		 System.out.println("First Initial:");
		 firstInitial = keyboard.next();
		 System.out.println("lastName Initial:");
		 lastName = keyboard.next();
		 System.out.println("house number:");
		 houseNumber = keyboard.next();
		 System.out.println("street name:");
		 streetName = keyboard.next();
		 System.out.println("street type:");
		 streetType = keyboard.next();
		 System.out.println("city:");
		 city = keyboard.next();
		 System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		 System.out.println(streetName + " " + streetType + " " + city);
		 keyboard.nextLine();
		 keyboard.close();
		 }
		}

