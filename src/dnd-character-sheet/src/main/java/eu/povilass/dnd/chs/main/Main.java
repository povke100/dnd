package eu.povilass.dnd.chs.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import eu.povilass.dnd.chs.enums.Currencies;
import eu.povilass.dnd.chs.items.Currency;
import eu.povilass.dnd.chs.items.CurrencyImpl;
import eu.povilass.dnd.chs.items.Item;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		int exit = main.run();
		System.exit(exit);

	}
	
	public int run() {
		List<Item> money = new ArrayList<>();
		
		CurrencyImpl gold = new CurrencyImpl();
		gold.setCurrency(Currencies.GOLD);
		gold.setAmount(100);
		
		money.add(gold);
		
		int exitCode = 0;
		Scanner sc = new Scanner(System.in);
		
		boolean keepAlive = true;
		
		System.out.println("Welcome to D&D character sheet!");
		while(keepAlive) {
			String command = sc.nextLine();
			
			switch (command) {
			case "ex":
			case "exit":
				keepAlive = false;
				exitCode = 0;
				break;
			case "m":
			case "money":
				if(money.get(0) instanceof Currency) {
					Currency curr = (Currency) money.get(0);
					curr.setAmount(200);
					System.out.println(curr.getAmount());
				}
				break;
			default:
				System.out.println("Sorry, you have entered invalid command, try again...");
			
			}
		}
		sc.close();
		
		return exitCode;
	}

}
