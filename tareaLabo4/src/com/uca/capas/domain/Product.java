package com.uca.capas.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


public class Product {
	
	@Size(message="La longitud debe ser entre 1 y 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	String name;
	
	@Size(message="La longitud debe ser entre 1 y 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	String marca;
	
	@Size(message="La longitud debe ser entre 1 y 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	String desc;
	
	@Size(message="La longitud debe ser entre 1 y 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	String cat;
	
	@NotNull(message="Este campo no puede estar vacio")
	@Positive(message="El precio no puede ser negativo")
	float price;
	
	@Size(message="La longitud debe ser entre 1 y 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Pattern(regexp="(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)",message="Fecha con formato dd/mm/yy")
	String vdate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getVdate() {
		return vdate;
	}
	public void setVdate(String vdate) {
		this.vdate = vdate;
	}
	
	
}


