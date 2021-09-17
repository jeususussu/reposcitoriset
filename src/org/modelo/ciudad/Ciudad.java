package org.modelo.ciudad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Ciudad {
	private int id;
	private String nombre;
	
	@Id 
	@GeneratedValue
	

	public String getNombre() {
		return nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
