package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("----main menu----- ");
			System.out.println("1_display all book  ");
			System.out.println("2_add book  ");
			System.out.println("3_update ");
			System.out.println("4_delete book ");
			System.out.println("5_search book ");
			System.out.println("6_exit ");
			System.out.println("enter your choice  ");

			int choice_number = scanner.nextInt();
			switch (choice_number) {
			// DISPLAY BOOK//
			case 1:
				Book.displayAllBook();
				break;
			// ADD BOOK//
			case 2:
				Book.addBooks(scanner);

				break;
			case 3:

				// UPDATE BOOK//
				Book.upDateBookssss(scanner);

				break;
			case 4:

				// DELETE BOOK//
				Book.DeleteBooksss(scanner);


				break;
			case 5:

				// search BOOK//
				Book.searchBook(scanner);

				break;
			case 6:

				// exit//
				quitterLApplicatio();

				break;
			}
		}
	}

	public static void quitterLApplicatio() {
		System.exit(0);

	}
}
