Exercise01:




Exerise02:
The exercise posed a challenge because the splitting up 
of responsibilities could be implemented in different ways.

The classes which were chosen as delegators are ShoppingSW
and Customer.
The customer has to have all the functionalities that the 
customer himself needs to be in this site.
So we implemented the class as abstract-class since the 
customer-types only vary in their itemcaps.
The products that he's selling are stored in the own class
just as reference. When selling though, he calls ShoppingSW, 
which itself delegates the sell to ProductList, where all 
products currently on the market are being stored.
The customer delegates the Shoppingcart to it's own class.
There he can store certain products and when buying,
the Shoppingcart contacts ProductList via ShoppingSW to 
control if the products are still for sale.
If yes, it removes the products from the list and returns 
them to the customer (selling customers get their items removed).
The Cash-Flows are being delegated to Payments, where they are added/
removed from the customers balances depending on method.
The buy only works, if the balances can support the prices.

ShoppingSW has to be a uniqueclass (Singleton) and delegates the 
Searchbar to an own class and passes the uniqueclass Productlist(Singleton)
to it. By that the customer can enter Strings to find products or
filter the products by class.

This behaviour can be achieved by splitting the abstract class Product
which has all functionalities and attributes necessary for all products
into the abstract classes clothes and shoes. They themselves get
extended by the sub-product-classes which can get implemented but leave
all the functionalities to the product-abstract class (avoid reusing code).

The abstract Class Payment which can be allocated (max one) by customer
provides the shared functionalities of all payment-methods.
They extend the abstract class and add all the functionalities that are 
not shared to themselves (since they can behave differently).
The classes aggregate the prices of the products in the shoppingcart (which they get passed)
themselves and check if the price exceeds the payment-method's capacity.
If yes, they return true and allow the shoppingcart to proceed with the buy-process and
they remove the aggregated prices of the existing products from their own balance.


