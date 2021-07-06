package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}


	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
		
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}


	public Batalla getBatalla(String nombreBatalla) {
		 
		return batallas.get(nombreBatalla);
	}


	public void crearBatalla(String nombreBatalla, TipoDeBatalla tipo, double latitud, double longitud) {
		Batalla nueva = new Batalla(latitud, longitud,tipo);
		batallas.put(nombreBatalla, nueva);
		
	}


	public boolean enviarALaBatalla(String string, int i) {
		// TODO Auto-generated method stub
		return false;
	} 
	
}
