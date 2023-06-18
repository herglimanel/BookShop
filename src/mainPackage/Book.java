package mainPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Book {
	private String name;
	private double price;
	private String author;
	static ArrayList<Book> BookListe = new ArrayList<>();

	public Book() {
		super();
	}

	public Book(String name, double price, String author) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static void upDateBookssss(Scanner scanner) {
		boolean isMenu = true;
		while (isMenu) {

			System.out.println("----main menu----- ");
			System.out.println("1_UpDate book  Name  ");
			System.out.println("2_adUpDate book  AuThor  ");
			System.out.println("3_uUpDate book  Price ");
			System.out.println("4_back to the back menu ");
			System.out.println("5_exit ");
			System.out.println("enter your choice  ");

			int choiceNumber1 = scanner.nextInt();
			switch (choiceNumber1) {
			case 1:
				// UpDate book Name
				System.out.println("ENTER BOOK NAME ");
				String BookName = scanner.next();
				Book oldbook = Book.getBookByName(BookName);
				Book newbook = Book.getBookByName(BookName);
				if (oldbook == null) {
					System.out.println("NO BOOK WITH THIS NAME");
				} else {
					System.out.println("ENTER book new NAME ");
					String NewName = scanner.next();
					newbook.setName(NewName);

					if (Book.UpDateBook(newbook, oldbook)) {
						System.out.println("update susseccfully");

					} else {
						System.out.println("update failed");

					}

				}

				break;
			case 2:
				// UpDate book Author
				System.out.println("ENTER BOOK NAME ");
				String BookName1 = scanner.next();
				Book oldbook1 = Book.getBookByName(BookName1);
				Book newbook1 = Book.getBookByName(BookName1);
				if (oldbook1 == null) {
					System.out.println("NO BOOK WITH THIS NAME");
				} else {
					System.out.println("ENTER book new author ");
					String NewAuthor = scanner.next();
					newbook1.setAuthor(NewAuthor);

					if (Book.UpDateBook(newbook1, oldbook1)) {
						System.out.println("update susseccfully");

					} else {
						System.out.println("update failed");

					}

				}

				break;
			case 3:
				// UpDate book Price
				System.out.println("ENTER BOOK NAME ");
				String BookName2 = scanner.next();
				Book oldbook2 = Book.getBookByName(BookName2);
				Book newbook2 = Book.getBookByName(BookName2);
				if (oldbook2 == null) {
					System.out.println("NO BOOK WITH THIS NAME");
				} else {
					System.out.println("ENTER book new author ");
					Double NewPrice = scanner.nextDouble();
					newbook2.setPrice(NewPrice);

					if (Book.UpDateBook(newbook2, oldbook2)) {
						System.out.println("update susseccfully");

					} else {
						System.out.println("update failed");

					}

				}

				break;

			case 4:
				// back to the back menu
				isMenu = false;

				break;
			case 5:
				// 5_exit
				MainClass.quitterLApplicatio();

				break;

			default:
				break;
			}
		}
	}

	public static void displayAllBook() {
		ArrayList<Book> mylisteDeslistDLivres = Book.BookListe;
		if (mylisteDeslistDLivres.isEmpty()) {
			System.out.println("la liste est vide !!!!!!!!!!!! ");
		} else {
			System.out.println("Name                     auther                 Price");

			for (Book book : mylisteDeslistDLivres) {
				System.out.println(book.getName() + "          " + book.getPrice() + "      " + book.getAuthor());
			}
		}
	}

	public static void addBooks(Scanner scanner) {
		System.out.println(" enter lescompteures des livres");
		int ccompteurDesLivres = scanner.nextInt();

		if (ccompteurDesLivres < 0) {
			System.out.println("not valid  le compteur doit être >0 ");
		} else {
			for (int i = 0; i < ccompteurDesLivres; i++) {
				System.out.println("enter book  " + (i + 1) + "  name");
				String bookName = scanner.next();

				System.out.println("enter bookv " + (i + 1) + " author");
				String bookAuthor = scanner.next();
				System.out.println("enter book " + (i + 1) + " price ");
				double bookPrice = scanner.nextDouble();
				Book bok66 = new Book();
				bok66.setName(bookName);
				bok66.setAuthor(bookAuthor);

				bok66.setPrice(bookPrice);
				Book.BookListe.add(bok66);

			}

		}
	}

	public static Book getBookByName(String name) {
		for (Book book : BookListe) {
			if (book.name.equals(name)) {
				return book;

			}

		}
		return null;

	}

	public static boolean UpDateBook(Book newBook, Book oldBook) {
		if (BookListe.size() > 0) {
			int index = -1;
			for (int i = 0; i < BookListe.size(); i++) {
				if (BookListe.get(i).getName().equals(oldBook.getName())) {
					index = i;
					break;
				}
			}

			if (index != -1) {
				BookListe.get(index).setName(newBook.getName());
				BookListe.get(index).setAuthor(newBook.getAuthor());
				BookListe.get(index).setPrice(newBook.getPrice());
				return true;

			}
		}
		return false;

	}

	public static boolean delete(Book book) {
		if (!BookListe.isEmpty()) {
			BookListe.remove(book);
			return true;
		}
		return false;

	}

	public static void searchBook(Scanner scanner) {
		// TODO Auto-generated method stub

	}

	public static void DeleteBooksss(Scanner scanner) {

		System.out.println("enter the book name to delete ");
		String bookName = scanner.next();
		Book bookB = Book.getBookByName(bookName);
		if (bookB == null) {
			System.out.println("no book found");

		} else {
			// delete the book
			if (Book.delete(bookB)) {
				System.out.println(" delete successfully");
			} else {
				System.out.println(" delete failed");

			}

		}

	}

}
