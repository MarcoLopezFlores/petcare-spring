package mx.app.petcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Purchase {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private long id;
	
	private String code;
    
    private String status;
    //En proceso
    //Enviada
    //Entregada
    
    

    @ManyToOne
    private CreditCard cardCredit;
    
    @OneToOne
    private ShoppingCart shoppingCart;
    
    @ManyToOne
    private Person person;
}