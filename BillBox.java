/** BillBox -- a billbox is a box for storing cash.

    @author  Izan Ahmed
    Grinnell College
    ahmediza@grinnell.edu   

    An object of this class has functions to perform on the box of
    storing cash.
*/
public class BillBox {
	/** The billbox field stores the current total money.
*/
	
	private int billbox;
	
	/** The BillBox constructor allocates storage for a BillBox,
        initializes its current total value to 0 and returns it. 
*/
	
	public BillBox(){		
		this.billbox = 0;	
	}
	
	/** The getBillBox method returns the current total in the billbox.
*/
	
	public int getBillBox() {
		return this.billbox;
	}
	
	/** The setBillBox method imposes a specified value to be set to
	  	the total value of billbox.
*/
	
	public void setBillBox(int value) {
		this.billbox = value;
	}
	
	/** The incrementBillBox increases the value of the billbox by 
	 	a set amount.
*/
	
	public void incrementBillBox(int amount) {
		this.billbox += amount;
	}
}

/* Copyright © 2019 Izan Ahmed */