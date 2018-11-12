# ProyectJava
Commit 1


In this project I have developed a program focused on an online store, in which an account and a password are necessary to verify authentication.
This project has tg¡he following tests:
- CategoryTest
- List_categoryTest
- List-productTest
- ProductTest
- UserTest

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

}


It has been declared in 6 classes that are:

class Category, 
class List_category, 
class List_product, 
class Menu, 
class Product, 
class User.


In the main menu it is necessary to access the store with an username and a password.
To exit the main menu, type "exit" in the username and password.

Main menu:

1. Enter an username
2. Enter a password


After authentication, the secondary menu will be displayed

1. See all products
2. See all categories
3. Search a product
4. Search by category
5. Buy
6. Your products
0. exit

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

## In option 0.
The user can exit the program.

