package org.biff.log.sukkit.randomize;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ItemList {

	public Random rng;
	public ArrayList<String> list;

	public ItemList(String lists) {
		list = new ArrayList<String>();
		if (lists.equals("")) {
			File folder = new File(ClassLoader.getSystemResource("org/biff/log/sukkit/resources").getFile());
			File[] listOfFiles = folder.listFiles();

			    for (int i = 0; i < listOfFiles.length; i++) {
			      if (listOfFiles[i].isFile()) {
			        createListFromFile(listOfFiles[i].getName().substring(listOfFiles[i].getName().lastIndexOf("\\")+1));
			      }
			    }
		}
		else{
			String[] splitLists = lists.split(",");
			for (int i = 0; i < splitLists.length; i++) {
				createListFromFile(splitLists[i]+".txt");
			}
		}
	
		rng = new Random();
	}

	public String randomItem() {
		int index = rng.nextInt(list.size());
		String item = list.get(index);
		return item;
	}
	public void createListFromFile(String listNameFromFile){
		try {
			File file = new File(ClassLoader.getSystemResource("org/biff/log/sukkit/resources/" + listNameFromFile).getFile());
			Scanner s = new Scanner(file);
			while (s.hasNextLine()){
			    list.add(s.nextLine());
			}
			s.close();
		} catch (Exception e) {
			System.out.println("There was an error with your file(s). The program will exit.");
			System.exit(1);
		}
		
	}
}