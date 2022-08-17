package org.comIT.EcommerceDomain;

import java.sql.Date;
import java.util.List;

public class Order {
	Long id;
	Date orderDate;
	Date shippingDate ;
	Double orderTotal;
	List <CartItem> CartItem ;
	Shipping shipping;
	Payment payment ;
	User user ;
	

}
