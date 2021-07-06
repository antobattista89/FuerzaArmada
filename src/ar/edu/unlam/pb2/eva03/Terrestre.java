package ar.edu.unlam.pb2.eva03;

public class Terrestre extends Vehiculo{

	private Double velocidad= 0.0;
	
	public Terrestre(Integer iD, String modelo) {
		super(iD, modelo);
		
	}

	public double getVelocidad() {
		
		return this.velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
