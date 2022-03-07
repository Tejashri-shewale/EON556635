package BookManagementSystem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

class MainClass {

	public static void main(String[] args) {
		
		System.out.println(" \n \t \t \t WELCOME TO BOOK MANAGEMENT SYSTEM ");

		Scanner sc = new Scanner(System.in);

		int c, usr;
		ArrayList<Book> bookList = new ArrayList<Book>();

		do {
			Book b = new Book();
			
			System.out.println(" \t \t \t   :::: MENU :::: ");
			System.out.println("========================================================================================================");
			System.out.println("\t 1. ADD A BOOK ");
			System.out.println("\t 2. Display Records ");
			System.out.println("\t 3. DELETE A BOOK ");
			System.out.println("\t 4. UPDATE A BOOK ");
			System.out.println("\t 5. SEARCH ");
			System.out.println("\t 0. EXIT	");
			System.out.println("======================================================================================================");
			int opt = sc.nextInt();

			switch (opt) {
			case 1:
				System.out.println(" \n \t **** Add Book Records **** ");
				
				System.out.println("\n Enter Book Id \n ");
				b.setBookId(sc.nextInt());
				System.out.println("\n Enter the Book name \n ");
				b.setBookName(sc.next());
				sc.nextLine();
				System.out.println("\n Enter the Book Author Name \n  ");
				b.setAuthorName(sc.nextLine());
				System.out.println("\n Enter the Book Price \n  ");
				b.setBookPrice(sc.nextFloat());
				System.out.println("====================================================================================================");
				b.add(b);
				bookList.add(b);
				
				break;
			case 2:
				b.display(bookList);
				System.out.println("====================================================================================================");
				break;
			case 3:
				//DELETE METHOD
				System.out.println(" \n \t **** Enter any Book id that you want to delete **** ");
				System.out.println("\n Enter the Bookid to be deleted \n"); 
				int r = sc.nextInt();
				
				boolean found = false;

				Iterator<Book> i = bookList.iterator();
				while (i.hasNext()) {
					Book b1 = (Book) i.next();

					if (b1.getBookId() == r) 
					{
						System.out.println(b1.getBookId());
						i.remove();
						found = true;
						
						break;
					}
					
				}
				System.out.println("=================================================================================================");
				 break;
				 
			case 4:   //UPDATE METHOD
				System.out.println(" \n \t **** Enter any Book id that you want to update **** ");
				Book b3 = new Book();
				System.out.println(" \n Enter the Bookid to be Updated \n ");
				int u = sc.nextInt();

				boolean found4 = false;
				
				ListIterator<Book> bb = bookList.listIterator();
				while(bb.hasNext())
				{
					Book e = (Book) bb.next();
					if(e.getBookId() == u)
					{
						System.out.println("\n Enter the new Id \n ");
						int BookId = sc.nextInt();
					
						System.out.println("\n Enter New Book name \n ");
						String bookname = sc.next();
					
						System.out.println("\n Enter author name \n ");
						String authorName = sc.next();
						
						System.out.println("\n Enter the New Price \n ");
						float price = sc.nextFloat();
					
						
						bb.set(new Book(BookId,bookname,authorName,price));
						
						found4 = true;
					}
					
				}
				if(found4 == true)
				{
					System.out.println("\t Id Found and Updated Successfully !");
				}
				else
				{
					System.out.println("\t Id Does Not Exist ");
				}				
//				ob.update();
				System.out.println("====================================================================================================");
				break;
				
			case 5 :
				System.out.println(" \n \t **** Enter any Book id that you want to Search **** ");
				// SEARCH METHOD 
				boolean found2 = false;
				System.out.println("\n Enter Id to search \n ");
				int id = sc.nextInt();
				System.out.println("----------------------------------------------------------------------------------------------------");	
					
				
				boolean found3 = false;

				Iterator i2 = bookList.iterator();
				while (i2.hasNext()) {
					Book b1 = (Book) i2.next();

					if (b1.getBookId() == id) {
						System.out.println(b1.toString());
						System.out.println(" \n Present");
						found = true;
						break;
					}
					else
						System.out.println("\n Not Present");
				}
				
				
				
				//found2 = b.search(b,id);
				System.out.println("====================================================================================================");
				break;
				
			case 0:
				System.exit(0);
			}

			System.out.println("\t Press any key to continue and press 0 to Exit !");
			c = sc.nextInt();
		} while (c != 0);

	}
}