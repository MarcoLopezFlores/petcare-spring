package mx.app.petcare.dto;

import lombok.Data;
import mx.app.petcare.entity.Brand;
import mx.app.petcare.entity.Category;
import mx.app.petcare.entity.Specie;

@Data
public class ProductReadDto {

	private long id;	
	private String name;
	private String description;
	private String image;
	private double price;
	private int quantityStock;  
	private PartnerDto partner;
    private Brand brand;
    private Category category;
    private Specie specie;
    private PictureReadDto picture;
}
