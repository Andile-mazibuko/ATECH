package atech.entities.ac.za;

import atech.entities.ac.za.Customer;
import atech.entities.ac.za.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-07T22:09:43")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, String> orderId;
    public static volatile SingularAttribute<Order, Customer> customerId;
    public static volatile ListAttribute<Order, Product> orderProducts;

}