package org.biff.log.sukkit.randomize;

public class RandomItemMain
{
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
