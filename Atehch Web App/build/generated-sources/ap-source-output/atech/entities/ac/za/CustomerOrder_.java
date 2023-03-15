package atech.entities.ac.za;

import atech.entities.ac.za.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-15T19:35:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-07T21:41:53")
>>>>>>> ca700508c9eb712dd074ef10a0f5a679e2dc7426
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, String> orderStatus;
    public static volatile SingularAttribute<CustomerOrder, Double> orderCost;
    public static volatile SingularAttribute<CustomerOrder, Long> id;
    public static volatile SingularAttribute<CustomerOrder, Date> readyDate;
    public static volatile SingularAttribute<CustomerOrder, Date> orderDate;
    public static volatile SingularAttribute<CustomerOrder, Date> collectionDate;
    public static volatile ListAttribute<CustomerOrder, Product> products;

}