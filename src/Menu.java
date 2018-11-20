
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Menu {

	static User actualUser;
	static Scanner n = new Scanner(System.in);

	static void printProducts(Category n) {
		for(int i=0; i < n.products.list.size(); i++){
			System.out.println(n.products.list.get(i).getName());
				
		}			
	}
	
	
	static void printProductsBuy(User n) {
		for(int i=0; i<n.buyList.size();i++) {
			System.out.print("\n" + n.buyList.get(i).getName()+" "+n.buyList.get(i).getPrize()+"€");
		}
	}
	static double printTotalProductsBuy(User n) {
		
		double total = 0;
		for(int i=0; i<n.buyList.size(); i++) {
			
			total = total+ n.buyList.get(i).getPrize();
			
		}
		System.out.println("\nTotal: " + total);
		return total;
	}
	
	
	
	static boolean authentification(String username, String password) {
		boolean login = false;
		
		for(int i = 0; i < User.users.size(); i++) {
			if(username.equals(User.users.get(i).getUsername()) && password.equals(User.users.get(i).getPassword())) {
				login = true;
				actualUser = User.users.get(i);
				break;
			}
		}
		
		return login;
	}
	

	public static void main(String[] args) {
		
		User user1 = new User("Andres", "andres@andrewshop.com", "qwerty", 0001);
		User user2 = new User("Laura", "laura@andrewshop.com", "qwerty", 0002);
		User user3 = new User("José Luis", "joséluis@andrewshop.com", "qwerty", 0003);
		User user4 = new User("Alonso", "alonso@andrewshop.com", "qwerty", 0004);
		User user5 = new User("Max", "max@andrewshop.com", "qwerty", 0005);
		
		Category video = new Category("video", 001);	
		Category books = new Category("books", 002);
		Category music = new Category("music", 003);
		Category games = new Category("games", 004);
	
		Product movie1 = new Product("titanic", 00001, "video", 20, 8.50);
		Product movie2 = new Product("the hangover", 00010, "video", 20, 9.50);
		Product movie3 = new Product("saw", 00011, "video", 20, 7.45);
		Product movie4 = new Product("superman", 00100, "video", 20, 9.99);
		Product movie5 = new Product("spiderman", 00101, "video", 20, 7.60);
		
		Product book1 = new Product("ulisses",00110, "books", 25, 30.50);
		Product book2 = new Product("oliver twist",00111, "books", 40, 34.3);
		Product book3 = new Product("moby dick",01000, "books", 55, 45.30);
		Product book4 = new Product("dante",01001, "books", 70, 29.99);
		Product book5 = new Product("sherlock holmes",01010, "books", 81, 42.45);
		
		Product album1 = new Product("Electric Landyland", 01011, "music", 50, 12.55);
		Product album2 = new Product("modern sounds", 01100, "music", 35, 10.80);
		Product album3 = new Product("sticky fingers", 01101, "music", 60, 15.99);
		Product album4 = new Product("born to run", 01110, "music", 25, 10.00);
		Product album5 = new Product("crazy", 01111, "music", 40, 13.07);
		
		Menu menu = new Menu();
		
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
		
			if (authentification(username,pass)) {
				opcion = -1;
			
					
				while (opcion != 0) {
					System.out.println("\nChoose an opcion:");
					System.out.println("\n1. See all products");
					System.out.println("2. See all categories");
					System.out.println("3. Search a product");
					System.out.println("4. Search by category");
					System.out.println("5. Buy");
					System.out.println("6. Your products");
					System.out.println("7. Apply discout code");
					System.out.println("8. Contact with us");
					System.out.println("9. Leave a coment");
					System.out.println("0. Exit");		
				
					opcion = n.nextInt();
				
					
					
					switch(opcion) {
					
						//1. See all products
						case 1:
							
							for(int i=0;i < Product.general.list.size();i++) {
								System.out.println(Product.general.list.get(i).getName());
							}
							break;
							
						//2. See all categories	
						case 2:
							
							for(int i=0; i< Category.general.list.size(); i++ ) {
								System.out.println(Category.general.list.get(i).getName());
							}
							break;
							
						//3. Search a product
						case 3:
							
							String nameProduct;
							System.out.println("Enter product's name");
							Scanner nameP = new Scanner(System.in);
							nameProduct = nameP.nextLine();
							Product actualProduct = Product.general.search_product(nameProduct);
							
							if(actualProduct != null){
								
								System.out.println("\n"+ actualProduct.getName());
								System.out.println("Pryze: "+ actualProduct.getPrize()+"€");
								System.out.println("ID product: "+ actualProduct.getStock());
								System.out.println("Stock producto: "+ actualProduct.getStock());
							}else {
								System.out.println("Product not found");
							}
							
							break;
							
						//4. Search by category
						case 4:
							
							String nameCategories;
							System.out.println("Enter category's name");
							Scanner nameC = new Scanner (System.in);
							nameCategories = nameC.nextLine();
							Category actualCategory = Category.general.search_category(nameCategories);
							
							if(actualCategory != null) {
								printProducts(actualCategory);
							}else {
								System.out.println("Category`s not found");
							}
							break;
							
						//5. Buy
						case 5:
							
							String product;
							System.out.println("Enter a name product");
							Scanner productB = new Scanner (System.in);
							product = productB.nextLine();
							Product actualProductBuy = Product.general.search_product(product);
							
							if(actualProductBuy != null) {
								actualProductBuy.buy_product(actualUser);
							}
							break;
						
						//6. Your products
						case 6:
							
							
							System.out.println("\nUsername: "+actualUser.getUsername());
							System.out.println("Bought products: ");
							printProductsBuy(actualUser);
							printTotalProductsBuy(actualUser);
							
							break;
							
						case 7:
							
							ProgramDiscount.discountAndrewCode(0.50);
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
						
						//9. Leave a coment
						case 9:
							Scanner n = new Scanner(System.in);
								String text;
								int coments = 0, counter = 0;
								File fileComent = new File("Coments.txt");
								
								try {
									PrintWriter print = new PrintWriter(new FileWriter(fileComent));
									System.out.println("How many coments do you want to enter");
									text = n.nextLine();
									coments = Integer.parseInt(text);
									
									while(counter < coments) {
										counter = counter+1;
										System.out.println("Write your coment");
										text = n.nextLine();
										print.println(text);
									}
									System.out.println("Thaks for your coments");
									print.close();
								}
								catch(IOException e) {
									System.out.println("File not found");
								
								}
							
							break;
							
						default: 
							System.out.println("\nChoose a correct option");
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
			
		
