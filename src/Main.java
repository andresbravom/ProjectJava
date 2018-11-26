
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Main {

	static Scanner n = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		User user1 = new User("Andres", "andres@andrewshop.com", "qwerty", 0001);
		User user2 = new User("Laura", "laura@andrewshop.com", "qwerty", 0002);
		User user3 = new User("José Luis", "joséluis@andrewshop.com", "qwerty", 0003);
		User user4 = new User("Alonso", "alonso@andrewshop.com", "qwerty", 0004);
		User user5 = new User("Max", "max@andrewshop.com", "qwerty", 0005);
		
		Category video = new Category("Video", 001);	
		Category books = new Category("Books", 002);
		Category music = new Category("Music", 003);
		Category games = new Category("Games", 004);
	
		Product movie1 = new Product("Titanic", 00001, "Video", 20, 8.50);
		Product movie2 = new Product("The hangover", 00010, "Video", 20, 9.50);
		Product movie3 = new Product("Saw", 00011, "Video", 20, 7.45);
		Product movie4 = new Product("Superman", 00100, "Video", 20, 9.99);
		Product movie5 = new Product("Spiderman", 00101, "Video", 20, 7.60);
		
		Product book1 = new Product("Ulisses",00110, "Books", 25, 30.50);
		Product book2 = new Product("Oliver twist",00111, "Books", 40, 34.3);
		Product book3 = new Product("Moby dick",01000, "Books", 55, 45.30);
		Product book4 = new Product("Dante",01001, "Books", 70, 29.99);
		Product book5 = new Product("Sherlock holmes",01010, "Books", 81, 42.45);
		
		Product album1 = new Product("Electric Landyland", 01011, "Music", 50, 12.55);
		Product album2 = new Product("Modern sounds", 01100, "Music", 35, 10.80);
		Product album3 = new Product("Sticky fingers", 01101, "Music", 60, 15.99);
		Product album4 = new Product("Born to run", 01110, "Music", 25, 10.00);
		Product album5 = new Product("Crazy", 01111, "Music", 40, 13.07);
	
		Main menu1 = new Main();
		
		int opcion = 99;
		
		System.out.println("------------------Welcome to AndrewShop----------------------");

		String username;
		String pass;
		
		do {
			System.out.println("\nEnter an username");
			Scanner name = new Scanner(System.in);
			username = name.nextLine();
			System.out.println("Enter a password");
			Scanner password = new Scanner(System.in);
			pass = password.nextLine();
		
			if (AuthentificationUser.authentification(username,pass)) {
				opcion = -1;
			
				
				System.out.println("Choose a laguage: ");
				System.out.println("\n1. English");
				System.out.println("2. Spanish");
				System.out.println("3. French");
				
				Scanner language = new Scanner (System.in);
				
				Menu menu = null;
				Messages messages = null;
				Locale locale = null;	
				String selectionLanguage = language.nextLine();
				/*
				 * If condition to evaluate language if it is not equal
				 * then the default language will be english. 
				 */
				if(selectionLanguage.equals("2")) {
					locale = new Locale("es", "ES");
					menu = new Menu(locale);
					messages = new Messages(locale);				
				}else if(selectionLanguage.equals("3")) {
					locale = new Locale("fr", "FR");
					menu = new Menu(locale);
					messages = new Messages(locale);
				}else {
					locale = new Locale("en", "US");
					menu = new Menu(locale);
					messages = new Messages(locale);
				}
				
			
				while (opcion != 0) {
					
					menu.menu();
					opcion = language.nextInt();
					
					switch(opcion) {
					
						//1. See all products
						case 1:
			
							System.out.println("\n"+ messages.getMessages("productsInStock", locale));
							
							for(int i=0;i < Product.general.list.size();i++) {
								System.out.println("\n" + Product.general.list.get(i).getName());
							}
							break;
							
						//2. See all categories	
						case 2:
							System.out.println("\n" + messages.getMessages("categories", locale));
							
							for(int i=0; i< Category.general.list.size(); i++ ) {
								System.out.println("\n" + Category.general.list.get(i).getName());
							}
							break;
							
						//3. Search a product
						case 3:
							
							String nameProduct;
							System.out.println("\n" + messages.getMessages("enterTheProductsName", locale));
							Scanner nameP = new Scanner(System.in);
							nameProduct = nameP.nextLine();
							Product actualProduct = Product.general.search_product(nameProduct);
							
							if(actualProduct != null){
								
								System.out.println("\n"+ actualProduct.getName() + ":");
								System.out.println("\n"+ messages.getMessages("price", locale) + " " + actualProduct.getPrize()+"€");
								System.out.println("\n"+ messages.getMessages("idProduct", locale) + " " + actualProduct.getStock());
								System.out.println("\n"+ messages.getMessages("stockProduct", locale) + " " +actualProduct.getStock());
							}else {
								System.out.println("\n" + messages.getMessages("productNotFound", locale));
							}
							
							break;
							
						//4. Search products by category
						case 4:
							
							String nameCategories;
							System.out.println("\n" + messages.getMessages("enterCategory", locale));
							Scanner nameC = new Scanner (System.in);
							nameCategories = nameC.nextLine();
							Category actualCategory = Category.general.searchCategory(nameCategories);
							
							if(actualCategory != null) {
								Product.printProducts(actualCategory);
							}else {
								System.out.println("\n" + messages.getMessages("categoryNotFound", locale));
							}
							break;
							
						//5. Buy
						case 5:
							
							String product;
							System.out.println("\n" + messages.getMessages("enterTheProductsName", locale));
							Scanner productB = new Scanner (System.in);
							product = productB.nextLine();
							Product actualProductBuy = Product.general.search_product(product);
							
							if(actualProductBuy != null) {
								actualProductBuy.buy_product(User.actualUser);
								
								System.out.println("\n" + messages.getMessages("ThanksForYourPurchase", locale));
								
							}else {
								System.out.println("\n" + messages.getMessages("productNotFound", locale));
							}
							break;
						
						//6. Your products
						case 6:
							
							
							System.out.println("\n"+messages.getMessages("username", locale) + User.actualUser.getUsername());
							System.out.println("\n" + messages.getMessages("boughtProducts", locale));
							ProductsBought.printProductsBuy(User.actualUser);
							System.out.println("\n------------------------------");
							ProductsBought.printTotalProductsBuy(User.actualUser);
							
							break;
							
						case 7:
							String encuesta;
							System.out.println("\n" + messages.getMessages("YouWant", locale));
							Scanner n = new Scanner (System.in);
							encuesta = n.nextLine();
							
							if(encuesta.equals("Y") || encuesta.equals("y") || encuesta.equals("S") || encuesta.equals("s") || encuesta.equals("O") || encuesta.equals("o")) {
								ProgramDiscount.discountAndrewCode(0.20);
							}else {
								System.out.println("\n" + messages.getMessages("youMost", locale));
							}					
							
							
							break;
						
						//8. Contact with us
						case 8:
							Scanner file = null;
							
							try {
								file = new Scanner(new File("Contact.txt"));
							}
							catch(IOException e) {
								System.out.println("File not found");	
							}
							String data;
							
							while(file.hasNext()) {
								data = file.next();
								System.out.print("\n"+data+ " "+"\n");
							}
					
							break;
						
						//9. Leave a coments
						case 9:
							Scanner newComent = new Scanner(System.in);
							String text;
							int coments = 0, counter = 0;
							File fileComent = new File("Coments.txt");
							
							try {
								PrintWriter print = new PrintWriter(new FileWriter(fileComent));
								System.out.println("How many coments do you want to enter");
								text = newComent.nextLine();
								coments = Integer.parseInt(text);
								
								while(counter < coments) {
									counter = counter+1;
									System.out.println("\n" + messages.getMessages("howManyComments", locale));
									text = newComent.nextLine();
									print.println(text);
								}
								System.out.println("\n" + messages.getMessages("Thanks", locale));
								print.close();
							}
							catch(IOException e) {
								System.out.println("File not found");
							
							}
							
							break;
							
						default: 
							System.out.println("\n" + messages.getMessages("chooseOptionCorrect", locale));
							break;
						}					
			
				}
			
			}else if(!username.equals("exit") || !pass.equals("exit")){
				System.out.println("exit");
			}
		}
		while(!username.equals("exit") || !pass.equals("exit"));
	
	}
}
			
		
