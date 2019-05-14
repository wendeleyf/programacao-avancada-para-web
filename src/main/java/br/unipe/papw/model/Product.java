package br.unipe.papw.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	    (strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setName(String nome) {
		this.name = nome;
	}
	/**
	 * @return the descricao
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescription(String descricao) {
		this.description = descricao;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}
