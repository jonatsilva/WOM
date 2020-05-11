package com.tcs.wom.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class Equipo.
 */
@Entity
@Table(name = "equipos")
public class Equipo implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7191719154491037266L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** The id. */
	private Long id;

	/** The marca. */
	@NotNull
	private String marca;

	/** The precio. */
	@NotNull
	private String precio;

	/** The cantidad. */
	@NotNull
	private int cantidad;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Gets the marca.
	 *
	 * @return the marca
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public String getPrecio() {
		return this.precio;
	}

	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public int getCantidad() {
		return this.cantidad;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * Sets the marca.
	 *
	 * @param marca
	 *            the new marca
	 */
	public void setMarca(final String marca) {
		this.marca = marca;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio
	 *            the new precio
	 */
	public void setPrecio(final String precio) {
		this.precio = precio;
	}

	/**
	 * Sets the cantidad.
	 *
	 * @param cantidad
	 *            the new cantidad
	 */
	public void setCantidad(final int cantidad) {
		this.cantidad = cantidad;
	}

}
