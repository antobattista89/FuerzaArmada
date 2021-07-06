package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Acuatico{

	private Double altura = 0.01;
			
	public HidroAvion(Integer iD, String modelo) {
		super(iD, modelo);
		
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

}
