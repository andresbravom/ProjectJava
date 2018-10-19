
import java.util.Scanner;

public class Menu {

	static User actualUser;
	static Scanner n = new Scanner(System.in);

	static void printProducts(Category n) {
		for(int i=0; i<n.products.list.size();i++){
			
			System.out.println(n.products.list.get(i).getName());	
		}
		
	}
	static void printproductsbuy(User n) {
		for(int i=0; i<n.buy_Products.size();i++) {
			System.out.println(n.buy_Products.get(i).getName());

		}
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
		Product book4 = new Product("moby dick",01001, "books", 70, 29.99);
		Product book5 = new Product("sherlock holmes",01010, "books", 81, 42.45);
		
		Product album1 = new Product("Electric Landyland", 04, "music", 10, 5.5);
		Product album2 = new Product("modern sounds", 05, "music", 10, 5.5);
		Product album3 = new Product("sticky fingers", 06, "music", 10, 5.5);
		Product album4 = new Product("born to run", 06, "music", 10, 5.5);
		Product album5 = new Product("s", 06, "music", 10, 5.5);
		
		int opcion = 99;
		
		System.out.println("Bienvenido");

		String username;
		String pass;
		
		do {
			System.out.println("Intoduce nombre usuario");
			Scanner name = new Scanner(System.in);
			username = name.nextLine();
			System.out.println("Intoduce nombre contraseña");
			Scanner password = new Scanner(System.in);
			pass = password.nextLine();
		if (authentification(username,pass)) {
			opcion = -1;
			while (opcion != 0) {
				System.out.println("Elegir una opción");
				System.out.println("\n1. Mostrar todos los productos");
				System.out.println("2. Mostrar todas las categorias");
				System.out.println("3. Buscar un producto");
				System.out.println("4. Buscar un producto por categoría");
				System.out.println("5. Comprar");
				System.out.println("6. Carrito");
				System.out.println("0. Salir");		
				
				opcion = n.nextInt();
				
				switch(opcion) {
					case 1:
						
						for(int i=0;i < Product.general.list.size();i++) {
							System.out.println(Product.general.list.get(i).getName());
						}
					break;
						
					case 2:
						
						for(int i=0; i< Category.general.list.size(); i++ ) {
							System.out.println(Category.general.list.get(i).getName());
						}
			
					case 3:
						String nameProduct;
						System.out.println("Introducir el nombre del producto");
						Scanner nameP = new Scanner(System.in);
						nameProduct = nameP.nextLine();
						Product actualProduct = Product.general.search_product(nameProduct);
						
						if(actualProduct != null){
							
							System.out.println("\n"+ actualProduct.getName());
							System.out.println("Precio: "+ actualProduct.getPrize()+"€");
							System.out.println("ID del producto: "+ actualProduct.getStock());
							System.out.println("Stock del producto: "+ actualProduct.getStock());
						}
						break;
						
					case 4:
						String nameCategories;
						System.out.println("Introducir el nombre de la categoria");
						Scanner nameC = new Scanner (System.in);
						nameCategories = nameC.nextLine();
						Category actualCategory = Category.general.search_category(nameCategories);
						if(actualCategory != null) {
							printProducts(actualCategory);
						}
			
						break;
					case 5:
						String product;
						System.out.println("Que producto desea comprar");
						Scanner productB = new Scanner (System.in);
						product = productB.nextLine();
						Product actualProductBuy = Product.general.search_product(product);
						if(actualProductBuy != null) {
							actualProductBuy.buy_product(actualUser);
						}
						break;
						
					case 6:
						printproductsbuy(actualUser);
					}
				}
			
			}else if(!username.equals("salir") || !pass.equals("salir")){
				System.out.println("Error");
		}
		}while(!username.equals("salir") || !pass.equals("salir"));
		
		
		
		
		
		
	}
}
			
			
		
		
		
		


		
		
		/*	
		User test = new User("andres", "@", "qwerty", 5);
		
		int i = 0;
		while(i < Category.general.cList.size()) {
			System.out.println(Category.general.cList.get(i).getName());
			i++;
			}
		
		int j = 0;
		while(j < video.products.list.size()) {
			System.out.println(video.products.list.get(j).getName());
			j++;
			}
		movie1.buy_product(test);
		
		System.out.println(test.get_buy_product(0).getName());	

*/
