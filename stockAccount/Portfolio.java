package stockAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Portfolio {
	
	ArrayList<String> stockName = new ArrayList<String>();// storing user i/p in arraylist
	 ArrayList<Integer> numberOfShares = new ArrayList<Integer>();
	 ArrayList<Integer> sharePrice = new ArrayList<Integer>();
	 Scanner sc = new Scanner(System.in);

	 public void addStocks() { // method for adding stocks
	 System.out.print("Enter the stock name: ");// stock name in string
	 stockName.add(sc.next());

	 System.out.print("Enter number of shares present: ");
	 numberOfShares.add(sc.nextInt());

	 System.out.print("Enter price of each share: ");
	 sharePrice.add(sc.nextInt());
	 }

}
