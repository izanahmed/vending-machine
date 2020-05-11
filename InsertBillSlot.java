import java.util.InputMismatchException;
import java.util.Scanner; //for reading user input

/** InsertBillSlot -- a slot of depositing 1 dollar bills

    @author  Izan Ahmed
    Grinnell College
    ahmediza@grinnell.edu   

    An object of this class has functions to display what type of 
    responses to give to the user when he is buying a soda.
 */

public class InsertBillSlot {

	/** The billbox is a field of type BillBox (not created yet) used
	   	in determining the current total value at each step 
	 	of the buying process.
	 */

	private BillBox billbox;

	/** The InsertBillSlot constructor instantiates
	  	an object of type BillBox. 
	 */

	public InsertBillSlot() {	
		billbox = new BillBox();	
	}

	/** The AmountEntered method takes in user input when a user is 
	 * purchasing a soda. It also gives the user some instruction on how
	 * to purchase. With that it gives indication of a successful purchase, unsuccessful
	 * purchase and also prints the amount entered at each stage of purchasing.
	 * Lastly, this method checks for wrong input while purchasing as well.

	 	@param price of the soda, and billbox.
	 	@return whether or not the purchase was successful. (true if it 
	 			successful
	 */

	public boolean AmountEntered (int price, BillBox billbox) throws InputMismatchException {	

		try {
			Scanner B = new Scanner(System.in);

			int amount = 0;

			System.out.print("Put exactly one dollar and press enter: ");

			while (this.billbox.getBillBox() < 3) {
				amount = B.nextInt();
				if (amount != 1) {
					System.out.println("Sorry you have not followed the instructions please enter correct value after pressing V again!\n");
					return false;
				}		
				this.billbox.incrementBillBox(amount);
				System.out.printf("Amount entered till now = %d\nStatus: ", this.billbox.getBillBox());
			}//while		

			if (this.billbox.getBillBox() == price) {	
				System.out.print("You have successfully bought 1 can of Coke!\n\nCheck the Soda Receiver!\n\n");
				this.billbox.setBillBox(0);
				return true;
			}else {
				System.out.println("Sorry you have not followed the instructions please enter correct value after pressing V again!\n");
				return false;

			}
		}
		catch (InputMismatchException e) {
			System.out.println("Sorry you have not followed the instructions please enter correct value after pressing V again!\n");
			return false;
		}
	}
}

/* Copyright © 2019 Izan Ahmed */
