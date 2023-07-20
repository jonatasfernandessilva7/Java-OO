package Interface;

public class Circulo implements Figura{
	
	private int raio;
	
	//construtor
	public Circulo(int raio){
		this.raio = raio;
	}
	
	
	public int getRaio() {
		return this.raio;
	}
	
	public int setRaio(int raio) {
		return this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	}
}