package CipherWheel;

import CipherWheel.Display.Display;
import CipherWheel.Functionality.DisplayFunctionality;

public class main {

	private static DisplayFunctionality displayFunction;
	
	public static void main(String[] args) {
		
		displayFunction = new DisplayFunctionality();
		
		new Display(displayFunction);
	}
}
