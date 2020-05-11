package com.tcs.wom.service;

import java.util.List;

import com.tcs.wom.entitys.Equipo;

/**
 * The Interface InterfaceEquipoService.
 */
public interface InterfaceEquipoService {

	/**
	 * Gets the all equipo.
	 *
	 * @return the all equipo
	 */
	public List<Equipo> getAllEquipo();

	/**
	 * Gets the equipo by id.
	 *
	 * @param id
	 *            the id
	 * @return the equipo by id
	 */
	public Equipo getEquipoById(final Long id);

	/**
	 * Update equipo.
	 *
	 * @param equipo
	 *            the equipo
	 */
	public void updateEquipo(final Equipo equipo);

	/**
	 * Adds the equipo.
	 *
	 * @param equipo
	 *            the equipo
	 */
	public void addEquipo(final Equipo equipo);

	/**
	 * Delete equipo.
	 *
	 * @param id
	 *            the id
	 */
	public void deleteEquipo(final Long id);

}
