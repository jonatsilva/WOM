package com.tcs.wom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.wom.dao.EquipoDao;
import com.tcs.wom.entitys.Equipo;

/**
 * The Class EquipoService.
 */
@Service
public class EquipoService implements InterfaceEquipoService {

	/** The equipo dao. */
	@Autowired
	private EquipoDao equipoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tcs.wom.service.InterfaceEquipoService#getAllEquipos()
	 */
	@Override
	public List<Equipo> getAllEquipo() {
		return (List<Equipo>) equipoDao.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tcs.wom.service.InterfaceEquipoService#getEquipoById(java.lang.Long)
	 */
	@Override
	public Equipo getEquipoById(final Long id) {
		return equipoDao.findById(id).get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tcs.wom.service.InterfaceEquipoService#updateEquipo(com.tcs.wom.entitys
	 * .Equipo)
	 */
	@Override
	public void updateEquipo(final Equipo equipo) {
		equipoDao.save(equipo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tcs.wom.service.InterfaceEquipoService#addEquipo(com.tcs.wom.entitys
	 * .Equipo)
	 */
	@Override
	public void addEquipo(final Equipo equipo) {
		equipoDao.save(equipo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tcs.wom.service.InterfaceEquipoService#deleteEquipo(java.lang.Long)
	 */
	@Override
	public void deleteEquipo(final Long id) {
		equipoDao.deleteById(id);

	}

}
