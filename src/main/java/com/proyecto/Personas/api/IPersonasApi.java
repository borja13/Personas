package com.proyecto.Personas.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyecto.Personas.Model.MSSListaPersonas;

public interface IPersonasApi {
	@RequestMapping(value = "/personas", 
			method = RequestMethod.GET, 
			produces = "application/json")
	@ResponseBody
	MSSListaPersonas obtenerPersonas();

}
