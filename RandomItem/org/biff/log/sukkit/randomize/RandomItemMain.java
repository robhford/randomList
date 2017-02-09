package org.biff.log.sukkit.randomize;
import java.util.Scanner;

public class RandomItemMain
{
	  Scanner user_input = new Scanner(System.in); 

  public static void main(String[] args)
  {
	  RandomItemInputOutput inputOutput = new RandomItemInputOutput();
	  
	  inputOutput.printResult(inputOutput.promptUser());
	  
	  while (!inputOutput.promptClose()) {
		  inputOutput.printResult(inputOutput.promptUser());

	}
	  inputOutput.close();
  }
}
