package com.proyecto.Personas.impl;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.Personas.Model.MSSListaPersonas;
import com.proyecto.Personas.Model.Persona;
import com.proyecto.Personas.api.IPersonasApi;

@RestController
public class PersonasImpl implements IPersonasApi {

	@Override
	public MSSListaPersonas obtenerPersonas() {
		MSSListaPersonas personas = new MSSListaPersonas();
		Persona p = new Persona();
		p.setApellidos("San hiasa");
		p.setNombre("ewrewr");
		p.setDni("asada45");
		personas.addPersona(p);
		p = new Persona();
		p.setApellidos("San hiasa");
		p.setNombre("sadfsadsa");
		p.setDni("asada45");
		personas.addPersona(p);
		p = new Persona();
		p.setApellidos("San hiasa");
		p.setNombre("sadfsadsa");
		p.setDni("asada45");
		personas.addPersona(p);
		p = new Persona();
		p.setApellidos("San hiasa");
		p.setNombre("sadfsadsa");
		p.setDni("asada45");
		personas.addPersona(p);
		p = new Persona();
		p.setApellidos("San hiasa");
		p.setNombre("sadfsadsa");
		p.setDni("asada45");
		personas.addPersona(p);
		p = new Persona();
		p.setApellidos("San hiasa");
		p.setNombre("sadfsadsa");
		p.setDni("asada45");
		personas.addPersona(p);
		return personas;
	}

}
