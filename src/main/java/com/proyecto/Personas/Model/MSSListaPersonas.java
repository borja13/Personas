package com.proyecto.Personas.Model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MSSListaPersonas {
	
	private List<Persona> listaPersonas;
	
	public void addPersona(Persona p) {
		if(listaPersonas==null) {
			listaPersonas = new ArrayList<>();
		}
		listaPersonas.add(p);
	}

}
