/** StockPileOfSoda -- a stock pile of soda with its price

    @author  Izan Ahmed
    Grinnell College
    ahmediza@grinnell.edu   

    An object of this class has functions performing on the stock and the price of
    the soda.
*/

public class StockPileOfSoda {
	
	/** The price field stores the price of the soda.
*/
	private int price;
	
	/** The stock field stores the total stock of the soda.
*/
	private int stock;

	/** The StockPileOfSoda constructor allocates storage for a price 
	 * stock and initializes their current total value to 3 and 3, respectively.
	 * This part depends on the designer of the program. 
*/
	
	public StockPileOfSoda () {
		this.price = 3;
		this.stock = 3;
	}
	
	/** The getPrice method returns the price of the soda.
*/
	
	public int getPrice() {
		return this.price;
	}
	
	/** The setPrice method imposes a specified value to be set to
  	the price of the soda. (I have not used it in my program but it is for
  	anyone else who wants to use this program, can set the price themselves.)
*/
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	/** The getStock method returns the total stock of the soda.
*/	
	
	public int getStock() {
		return this.stock;
	}

	/** The setStock method imposes a specified value to be set to
  	the stock of the soda. (I have not used it in my program but it is for
  	anyone else who wants to use this program, can set the stock themselves.)
*/
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/** The decrementStock method decreases the value of the stock by 1.
*/
	
	public void decrementStock() {
		this.stock = this.stock - 1;
	}
}

/* Copyright © 2019 Izan Ahmed */