package com.ts.sol;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Terminal {

	private final Solution solution;
	
	public Terminal(final Solution solution) {
		this.solution = solution;
	}

	public void start() {
		showCommand();

		while (true) {
			Scanner scanner = new Scanner(System.in);
			int searchKey = readInt(scanner);
			if(searchKey == 0) break;
			String[] arr = new String[2];
			switch (searchKey) {
			case 1: {
				System.out.println("Enter zip code:");
				arr[0] = readUserInput(scanner);
				break;
			}
			case 2: {
				System.out.println("Enter State:");
				arr[0] = readUserInput(scanner);
				break;
			}
			case 3: {
				System.out.println("Enter City:");
				arr[0] = readUserInput(scanner);
				break;
			}
			case 4: {
				System.out.println("Enter Type:");
				arr[0] = readUserInput(scanner);
				break;
			}
			case 5: {
				System.out.println("Enter Bank Name:");
				arr[0] = readUserInput(scanner);
				break;
			}
			case 6: {
				System.out.println("Enter City:");
				arr[0] = readUserInput(scanner);
				System.out.println("Enter State:");
				arr[1] = scanner.nextLine();
				break;
			}
			case 7: {
				printResult(solution.getCache());
				break;
			}
			default:
				System.out.println("Invalid Search option");
				showCommand();
			}
			processRequest(searchKey, arr);
		}
	}

	private void processRequest(int searchKey, String[] arr) {
		System.out.println("Your input was: "+searchKey+" - "+arr[0]+" - "+(arr[1] != null ? arr[1]:""));
		Collection<Bank> result = solution.filter(searchKey, arr);
		printResult(result);
	}

	private static String readUserInput(Scanner scanner) {
		//ignore system instruction
		scanner.nextLine();
		return scanner.nextLine();
	}
	
	private int readInt(Scanner scanner) {
		try {
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("---------Invalid entry, please re-enter---------");
			showCommand();
		}
		return 7;
	}
	
	private void showCommand() {
		System.out.println("Enter search command");
		System.out.println("Search by zip code enter: 1");
		System.out.println("Search by State enter: 2");
		System.out.println("Search by City enter: 3");
		System.out.println("Search by Type enter: 4");
		System.out.println("Search by Bank Name enter: 5");
		System.out.println("Search by City & State enter: 6");
		System.out.println("Show all available data enter: 7");
		System.out.println("To exit - ctrl+c, or 0");
	}
	
	public static void printResult(Collection<Bank> result2) {
		if(result2.isEmpty()) {
			System.out.println("No result found.");
		} else {
			result2.forEach(System.out::println);
		}
		System.out.println("-------------------------------------------------");
	}
}
