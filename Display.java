/** Display -- a Display is a display screen for the machine

    @author  Izan Ahmed
    Grinnell College
    ahmediza@grinnell.edu   

    An object of this class has functions to display when the vending
    machine is in use.
*/

public class Display {
	
	/** The Diagram method prints out the interface of the vending machine.
*/ 
	public void Diagram(int price, int stock) {
		for(int i = 0; i < 5; i++){
		    if (i == 0){
		        System.out.println("|-----Coke------|");
		    }else if(i == 4){
		        System.out.println("|---------------|");
		    }else if (i == 3){
		        System.out.printf("|  Price  $%d    |\n", price);
		        System.out.printf("|  Stock   %d    |\n", stock);
		    }
		}	
	}
	/** The Instructions method prints out the different options for the 
	  	vending machine.
*/
	public void Instructions() {
		System.out.println("\nWelcome to the Coke Vending Machine!\n");
		System.out.println("To SEE balance press 'B'");
		System.out.println("To BUY press 'V'");
		System.out.println("To CHECK SODA RECEIVER press 'A'");
		System.out.println("To PICK UP SODA press 'P'");
		System.out.println("To EXIT press 'X'\n");		
	}
}

/* Copyright © 2019 Izan Ahmed */