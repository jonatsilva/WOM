package com.tcs.wom.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.wom.entitys.Equipo;
import com.tcs.wom.service.InterfaceEquipoService;

/**
 * The Class ProductoController.
 */
@RestController
@RequestMapping(value = "/producto")
public class ProductoController {

	/** The log. */
	private Logger LOG = LoggerFactory.getLogger(this.getClass());

	/** The equipo service. */
	@Autowired
	private InterfaceEquipoService equipoService;

	/**
	 * Gets the equipos.
	 *
	 * @return the equipos
	 */
	@GetMapping(value = "/equipos")
	private List<Equipo> getAllEquipo() {
		LOG.info("se ejecuta getAllEquipo()");
		try {
			return equipoService.getAllEquipo();
		} catch (Exception e) {
			LOG.error("Error en consulta lista equipos");
			return new ArrayList<Equipo>();
		}
	}

	/**
	 * Gets the equipo by id.
	 *
	 * @param id
	 *            the id
	 * @return the equipo by id
	 */
	@GetMapping(value = "/equipos/{id}")
	private Equipo getEquipoById(@PathVariable(value = "id", required = true) Long id) {
		LOG.info("se ejecuta getEquipoById()");
		try {
			return equipoService.getEquipoById(id);
		} catch (Exception e) {
			LOG.error("Error en consulta del equipo id " + id);
			return new Equipo();
		}

	}

	/**
	 * Adds the equipo.
	 *
	 * @param equipo
	 *            the equipo
	 * @return the string
	 */
	@PostMapping(value = "/equipos")
	private String addEquipo(@Valid @RequestBody Equipo equipo) {
		LOG.info("se ejecuta addEquipo()");
		try {
			equipoService.addEquipo(equipo);
		} catch (Exception e) {
			LOG.error("Error insertar equipo");
			return "insertar equipo NOK";
		}
		return "insertar equipo OK";
	}

	/**
	 * Update equipo.
	 *
	 * @param equipo
	 *            the equipo
	 * @return the string
	 */
	@PutMapping(value = "/equipos")
	public String updateEquipo(@RequestBody Equipo equipo) {
		LOG.info("se ejecuta updateEquipo()");
		try {
			equipoService.updateEquipo(equipo);
		} catch (Exception e) {
			LOG.error("Error al actualizar equipo");
			return "actualizar equipo NOK";
		}
		return "actualizar equipo OK";
	}

	/**
	 * Delete equipo.
	 *
	 * @param id
	 *            the id
	 * @return true, if successful
	 */
	@DeleteMapping(value = "equipos/{id}")
	private String deleteEquipo(@PathVariable(value = "id", required = true) Long id) {
		LOG.info("se ejecuta deleteEquipo()");
		try {
			equipoService.deleteEquipo(id);
		} catch (Exception e) {
			LOG.error("Error al eliminar el equipo id " + id);
			return "Equipo elininado NOK";
		}
		return "Equipo elininado OK";
	}

}
