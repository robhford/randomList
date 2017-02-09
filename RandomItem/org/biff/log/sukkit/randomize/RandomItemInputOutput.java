package org.biff.log.sukkit.randomize;

import java.util.Scanner;

public class RandomItemInputOutput {
	
	Scanner user_input = new Scanner(System.in);

	public RandomItemInputOutput(){
		
	}
	public String[] promptUser(){ 
		  int number = 0;
		  String lists;
		  System.out.print("How many random items do you want: ");
		  try {
			  number = Integer.parseInt(user_input.nextLine());
		} catch (Exception e) {
			System.out.println("There was an error with your input, please try again.");
			number = Integer.parseInt(promptUser()[0]);
		}
		  System.out.print("What lists do you wish to include (filename or * for all, comma seperated): ");
		  lists = user_input.nextLine();
		  String[] array = new String[2];
		  array[0] = "" + number;
		  array[1] = lists;
		  return array;
	  }
	  public void printResult(String[] array){
		  ItemList itemList = new ItemList(array[1]);
		  for (int i = 0; i < Integer.parseInt(array[0]); i++) {
			  System.out.println(itemList.randomItem());
			}
	  }
	  public void close(){
		  user_input.close();
	  }
	  public boolean promptClose(){
		  System.out.print("Exit? (Y/N): ");
		  String answer = user_input.nextLine();
		  return answer.equalsIgnoreCase("Y");
	  }
}
