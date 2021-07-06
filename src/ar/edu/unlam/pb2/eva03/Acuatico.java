package ar.edu.unlam.pb2.eva03;

public class Acuatico extends Vehiculo{

	private Double profundidad = 0.0;

	public Acuatico(Integer iD, String modelo) {
		super(iD, modelo);
		
		
	}
	
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public double getProfundidad() {
		
		return this.profundidad;
	}

}
