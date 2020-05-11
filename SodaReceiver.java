/** SodaReceiver -- a device which receives the dropped soda.

    @author  Izan Ahmed
    Grinnell College
    ahmediza@grinnell.edu   

    An object of this class has functions to perform on the status of
    receiver.
*/

public class SodaReceiver {
	
	/** The Status field stores the current status of the receiver.
*/	
	private boolean Status;
	
	/** The SodaReceiver constructor allocates storage for a Status,
    initializes its initial value to false, since at the start no soda is in the
    receiver. 
*/
	
	public SodaReceiver() {
		this.Status = false;	
	}

	/** The getStatus method returns the current state/ status of the receiver.
*/
	
	public boolean getStatus() {
		return this.Status;
	}
	
	/** The setStatus method imposes a specified state to be set to
  	the current state of the receiver.
*/
	
	public void setStatus(boolean state) {
		this.Status = state;
	}
}

/* Copyright © 2019 Izan Ahmed */