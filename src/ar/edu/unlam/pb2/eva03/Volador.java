package ar.edu.unlam.pb2.eva03;

public class Volador extends Vehiculo{

	private Double altura=0.0;
	
	public Volador(Integer iD, String modelo) {
		super(iD, modelo);
		
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	
	
	
}
