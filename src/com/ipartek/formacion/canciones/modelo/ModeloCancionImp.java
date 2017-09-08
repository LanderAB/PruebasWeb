package com.ipartek.formacion.canciones.modelo;

import java.util.ArrayList;

import com.ipartek.formacion.canciones.pojo.Cancion;

public class ModeloCancionImp implements ModeloCancion {
	
	ArrayList<Cancion> canciones = null;
	
	
	

	public ModeloCancionImp() {
		super();
		if(canciones == null) {
			canciones = new ArrayList<Cancion>();
			canciones.add(new Cancion("Maigeneraison", "La Polla", "2:43"));
			canciones.add(new Cancion("Guerras Punicas", "Riot Propaganda", "3:21"));
			canciones.add(new Cancion("Haizea", "Glaukoma", "4:25"));
		}
	}

	@Override
	public ArrayList<Cancion> getAll() {
		
		return canciones;
	}

	@Override
	public Cancion getByPosicion(long id) {
		Cancion c = new Cancion("", "", "");
		for(int i=0; i < canciones.size(); i++) {
			if(canciones.get(i).getId() == id) {
				c = canciones.get(i);
			}
		}
		return c;
	}

	@Override
	public boolean eliminar(long id) {
		boolean resp = false;
		for(int i = 0; i < canciones.size(); i++) {
			if(canciones.get(i).getId() == id) {
				canciones.remove(i);
				resp = true;
			}
		}
		return resp;
	}

	@Override
	public boolean insert(Cancion c) {
		boolean resp = false;
		if(canciones.add(c)) {
			resp = true;
		}
		return resp;
	}

}
