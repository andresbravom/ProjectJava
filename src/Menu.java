
import java.util.Scanner;

public class Menu {

	static User actualuser;
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
	
	static boolean authentification(String username, String pasword) {
		boolean login = false;
		for(int i = 0; i < User.users.size(); i++) {
			if(username.equals(User.users.get(i).getUsername()) && pasword.equals(User.users.get(i).getPassword())) {
				login = true;
				actualuser = User.users.get(i);
				break;
			}
		}
		
		
		return login;
	}
	
	public static void main(String[] args) {
		
		User a = new User("Andres", "@", "qwerty", 1);
		User b = new User("Daniel", "@", "zxcvb", 1);
		
		Category video = new Category("video", 01);	
		Category books = new Category("books", 03);
		Category music = new Category("music", 04);
	
		Product movie1 = new Product("movie1", 01, "video", 5, 8.5);
		Product movie2 = new Product("movie2", 02, "video", 5, 8.5);
		Product movie3 = new Product("movie3", 03, "video", 5, 8.5);
		
		Product book1 = new Product("book1",01, "books", 20, 30);
		Product book2 = new Product("book2",01, "books", 20, 30);
		Product book3 = new Product("book3",01, "books", 20, 30);
		
		Product music1 = new Product("cd1", 04, "music", 10, 5.5);
		Product music2 = new Product("cd2", 05, "music", 10, 5.5);
		Product music3 = new Product("cd3", 06, "music", 10, 5.5);
		
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
							actualProductBuy.buy_product(actualuser);
						}
						break;
						
					case 6:
						printproductsbuy(actualuser);
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
