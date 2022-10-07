package atech.entities.ac.za;

import atech.entities.ac.za.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-07T22:09:43")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Product> wishList;
    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> gender;
    public static volatile SingularAttribute<Customer, Long> id;
    public static volatile SingularAttribute<Customer, String> type;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, String> lastname;

}