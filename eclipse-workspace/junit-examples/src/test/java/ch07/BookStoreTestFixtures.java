package ch07;

public class BookStoreTestFixtures {

	public static Book bookA;
	public static Book bookB;
	
	public static void createBookA() {
		
		bookA = new Book();
		Author authorA = new Author();
		
		authorA.setLastName("ABC");
		authorA.setFirstName("abc");

		bookA.setTitle("BookTitleA");
		bookA.setPrice(1000);
		bookA.setAuthor(authorA);
		
	}
	
	public static void createBookB() {
		
		bookB = new Book();
		Author authorB = new Author();
		
		authorB.setLastName("DEF");
		authorB.setFirstName("def");
		
		bookB.setTitle("BookTitleB");
		bookB.setPrice(2000);
		bookB.setAuthor(authorB);
		
	}
	
}
