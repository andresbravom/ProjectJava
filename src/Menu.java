import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Category video = new Category("video",01);	
		Category books = new Category("books", 03);
		Category music = new Category("music", 04);
	
		Product movie1 = new Product("movie1",01, "video", 5, 8.5);
		Product movie2 = new Product("movie2",02, "video", 5, 8.5);
		Product movie3 = new Product("movie3",03, "video", 5, 8.5);
		
		Product book1 = new Product("book1",01, "books", 20, 30);
		Product book2 = new Product("book2",01, "books", 20, 30);
		Product book3 = new Product("book3",01, "books", 20, 30);
		
		Product music1 = new Product("cd1", 04, "music", 10, 5.5);
		Product music2 = new Product("cd1", 05, "music", 10, 5.5);
		Product music3 = new Product("cd1", 06, "music", 10, 5.5);
		
		int opcion;
		System.out.println("Elegir una opción");
		System.out.println("\n1. Buscar producto");
		System.out.println("2. Buscar categoria");
		System.out.println("3. Comprar producto");
		System.out.println("0. Salir");
		
		
		Scanner n = new Scanner(System.in);
		opcion = n.nextInt();
		
	
		while (opcion != 0) {
			
	
			switch(opcion) {
			case 1:
				String nameProduct;
				System.out.println("Introducir el nombre del producto");
				Scanner nameP = new Scanner(System.in);
				nameProduct = nameP.nextLine();
				Product actualProduct = Product.general.search_product(nameProduct);
				
				if(actualProduct != null){
					System.out.println(actualProduct.getName()+" precio: " + actualProduct.getPrize()+"€");
					
				}
				break;
			
			case 2:
				String nameCategory;
				System.out.println("Introducir el nombre de la categoría");
				Scanner nameC = new Scanner(System.in);
				nameCategory = nameC.nextLine();
				Category actualCategory = Category.general.search_category(nameCategory);
				
				if(actualCategory != null){
					int j = 0;
					while(j < video.products.list.size()) {
						System.out.println(video.products.list.get(j).getName());
						j++;
						}
				}
				break;
				
			case 3:
				String product;
				System.out.println("Introducir el nombre del producto que desea comprar");
				Scanner buyP = new Scanner (System.in);
				
			}
		}
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
