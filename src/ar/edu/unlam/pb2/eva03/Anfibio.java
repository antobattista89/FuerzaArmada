package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Acuatico{

	private Double velocidad = 0.0;
	
	public Anfibio(Integer iD, String modelo) {
		super(iD, modelo);
		
	}
	
	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}


}
