import java.util.Scanner; //for reading user input

/** VendingMachine -- a vending machine which only sells soda.

@author  Izan Ahmed
Grinnell College
ahmediza@grinnell.edu   

An object of this class has functions to perform on the vending machine.
*/

public class VendingMachine {
	
	/** The Coke is a field of type StockPileOfSoda (not created yet) is
	a soda with a stock and a price for the vending machine.
*/
	
	private StockPileOfSoda Coke; 
	
	/** The Slot is a field of type InsertBillSlot (not created yet) used
   	in the buying process of the user.
*/
	
	private InsertBillSlot Slot;
	
	/** The Receiver is a field of type SodaReceiver (not created yet) used
   	to receive the soda after it is purchased.
*/
	
	private SodaReceiver Receiver;
	
	/** The DisplayScreen is a field of type Display (not created yet) used
   	in printing out the interface of the vending machine.
*/
	
	private Display DisplayScreen;
	
	/** The bill is a field of type BillBox (not created yet) used
   	in determining the current total value at each step 
 	of the buying process.
*/
	
	private BillBox Bill;

	/** The holder is a field of type boolean to hold the value of the AmountEntered function
	 * as it returns a boolean.
*/
	
	private boolean holder;
	
	/** The VendingMachine constructor instantiates
   		objects of type StockPileOfSoda, InsertBillSlot, SodaReceiver
   		and Display, respectively.
*/
	
	public VendingMachine() {	
		Coke = new StockPileOfSoda();	
		Slot = new InsertBillSlot();
		Receiver = new SodaReceiver();
		DisplayScreen = new Display();
	}
	
	/** The Interaction method basically does all the interactions
	 * a user has with the vending machine. It uses a switch statement for
	 * all the different options in the vending machine. It uses all the objects
	 * mentioned above to create a fully functioning vending machine. One other 
	 * good thing about this function is that it checks for user input at each 
	 * wrong option a user enters, it uses a while loop to keep the program
	 * running until the user terminates or the stock runs out.
*/
	
	public void Interaction () {
		while(true) {
			DisplayScreen.Diagram(Coke.getPrice(), Coke.getStock());
			
			DisplayScreen.Instructions();	
			
			Scanner A = new Scanner(System.in);
			
			System.out.print("Option: ");
			
			switch(A.nextLine()) {
			
			case "B" :
				System.out.printf("Balance is %d\n\n", Coke.getStock());
				if (Coke.getStock() <= 0) {
					System.out.printf("Sorry! No more Coke available! Please come back later!\n\n");
					continue;
				}
				continue;
			case "V" :
				if (Coke.getStock() <= 0) {
					System.out.print("We are no longer taking money! This machine is empty!\n");
					return;
				}else {
					holder = Slot.AmountEntered(Coke.getPrice(), Bill);
					if (holder == true) {
						Receiver.setStatus(true);
						Coke.decrementStock();
					}else {
						continue;
					}
				}
				continue;
			case "A" :	
				if (Receiver.getStatus() == true) {
					System.out.println("You have a coke, you can pick up!\n");
				}
				else
					System.out.println("Sorry nothing in here!\n");
				continue;
			case "P" :
				if (Receiver.getStatus() == true) {
					System.out.println("Successfully Picked!\n");
					Receiver.setStatus(false);;
				}else {
					System.out.println("Sorry nothing to pick! Buy a coke!\n\n");
				}
				continue;
			case "X" :
				System.out.println("Thank you for using this machine! Have a nice day!\n");
				return;
			default :
				System.out.println("Wrong input! Please try again!\n\n");
				continue;
			}
		}
	}
	
	/** The main method instantiates an object V of type VendingMachine and
	 * implements the Interaction function which allows the user to
	 * use the vending machine. 
*/
	
	public static void main(String[] args) {
		VendingMachine V = new VendingMachine();
		V.Interaction();
	}

}

/* Copyright © 2019 Izan Ahmed */