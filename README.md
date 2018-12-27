# ProyectJava

In this project I have developed a program focused on an online store, in which an account and a password are necessary to verify authentication.
This project has tg¡he following tests:

```java
- AthentificationUserTest
- CategoryNameTest
- CategoryIdTest
- CategoryTest
- CurrencyExchangeTest
- InternationalizationTest
- ListCategoryTest
- ListProductTest
- ProductTest
- ProductIdTest
- UserIdTest
- ProductPriceTest
- ProductStockTest
- ProductTestName
- ProductTest
- UserTest
- UserIdTest
```

an example of a serious test (List-productTest)
```java
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class List_productTest {

	@Test
	void testSearchProduct() {
		Product actualProduct = Product.general.search_product("Furniture");
		assertEquals(null, actualProduct);
	}
```

In this program I used the tool EclEmma Java Code Coverage, to evaluate the percentage of test of this application.
Below we can see in the following images before and after using this tool.



In this project I have declared the following classes
```java 
class AuthentificationUser
class Category
class Currency
interface Discount
class Discount
class DiscountCode
class ListCategory
class ListProduct
class Main
class Menu
class Messages
class Product
class ProductsBought
class ProgramDiscount
class ProxyDiscount
class User
```


For this project it is neccesary to create two files: the first file is used to show the information about the AndrewShop and the second one is used to comments.

In the main menu it is necessary to access the store with an username and a password.
To exit the main menu, type "exit" in the username and password.

Main menu:

1. Enter an username
2. Enter a password

After authentication, the user can choose a language
```java
Choose a laguage: 
1. English
2. Spanish
3. French
				
```
To implement the i18n API, the class has been created ``` public class Messages ``` 

```java
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;

public class Messages {
	private final ResourceBundle messages;
	private final Locale locale;
	
	public Messages(Locale locale) {
		this.locale = locale;
		messages = ResourceBundle.getBundle("Languages", locale);
	}
	public Locale getLocale() {
		return locale;
	}
	
	public String getMessages(String key, Object... arguments) {
		try {
			final String pattern = messages.getString(key);
			final MessageFormat format = new MessageFormat(pattern, getLocale());
			
			return format.format(arguments);
			
		}catch(MissingResourceException ex){
			return "!" + key;
			
		}
	}

}
```
For this implementation it is necessary to create a file for each language that you want to implement.
For example:
```java
option = Choose an option:
option1 = 1. See all products
option2 = 2. See all categories
option3 = 3. Search a product
option4 = 4. Search product by category
option5 = 5. Buy
option6 = 6. Your products
option7 = 7. Apply discount code
option8 = 8. Contact with us
option9 = 9. Leave a comment
option11 = 10. Currency converter
option10 = 0. Exit
```
After authentication, the secondary menu will be displayed

1. See all products
2. See all categories
3. Search a product
4. Search by category
5. Buy
6. Your products
7. Apply discount code
8. Contact with us
9. Leave a coment
10. Currency converter
0. Exit

I have created a general list for category and for product.

## In option 1. 
You can see all available products. 
I made a general list of products and inside I made list_product. 
I go through a list with  the "search_product" function.

## In option 2. 
You can see all available categories.
The "search_product" function does the same as the "search_category function", is structured in the same way.
It has a general list and each category has a list.

## In option 3. 
You can search the products after entering the name. 
In the case that the product does not exist, it sends the message: "Product not found".

## In option 4. 
You can search the category after entering the name.
In the case that the category does not exist, it sends a message like ("Category not found").

## In option 5. 
You can buy a product after searching for the product with the name and it is added to the user's purchase history. I developed this function in the product class, this function decreases the stock of products in the store.

## In option 6. 
The user can check the products that he has purchased, it works as a purchase history.

## In option 7.
In this option the user can apply discounts when accepting the conditions to send emails with advertising.
this option allows you to apply the 20% discount, also wraps your gift if you are a new customer.

An interface has been created 
```javapublic interface Discount {
	public void reduction(Double n);
} 
``` 
A Program class is created where the question will be asked to know if it is a new buyer or a regular buyer
```java
import java.util.Scanner;

public class ProgramDiscount {

	public static void discountAndrewCode(Double n) {
		
	Discount discount = null;
	
	try {
		System.out.println("Is it the first time you buy at this store? Y/N");
		Scanner c = new Scanner(System.in);
		String cd = c.nextLine();
		
		if(cd.equals("y")|| cd.equals("Y")) {
			
			discount = new DiscountCode();
			
		}else {
		
			discount = new ProxyDiscount();
				
		}
		
	}catch(Exception e) {
		return;
	}
	discount.reduction(0.20);
	
	}

}
```

## In option 8.

The user can get information from the store **First file**. For example.
```java
file = new Scanner(new File("Contact.txt");
```

**---------------AndrewShop---------------**

- Phone: +34-653-456-789
- Fax: +34-912-111-222-333
- Adress:C/Pirineos,Madrid-España
Email: andresbravo@andrewshop.com


**---------------Networks---------------**

- Web: https://www.AndrewShop.com/
- Facebook: https://www.facebook.com/AndrewShop/
- Twitter: https://twitter.com/AndrewShop
- LinkedIn: https://www.linkedin.com/in/AndrewShop/ 

## In option 9.

The user can leave comments and suggestions **Second file**. For example. 
```java
File fileComent = new File("Coments.txt");
PrintWriter print = new PrintWriter(new FileWriter(fileComent));
	System.out.println("How many coments do you want to enter");
	text = n.nextLine();
	coments = Integer.parseInt(text);
									
``` 

*This page is Amazing. Thanks for all.*

## In option 10.
This option allows the user to make a currency exchange to make the purchase more comfortable

## In option 0.
The user can exit the program.

## License

This software is licensed under [GPL-3.0 license](https://www.gnu.org/licenses/quick-guide-gplv3). For more information please read [LICENSE](./LICENSE).

## Credits
Creator of the project: [@andresbravom](https://github.com/andresbravom)

Colaborators:
- [@LauraRgz](https://github.com/LauraRgz)
- [@joseluishozg](https://github.com/joseluishozg)

