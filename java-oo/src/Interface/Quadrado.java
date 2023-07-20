package Interface;

public class Quadrado implements Figura{
	
	private int lado;
	
	//construtor
	public Quadrado(int lado){
		this.lado = lado;
	}
	
	
	public int getLado() {
		return this.lado;
	}
	
	public int setLado(int lado) {
		return this.lado = lado;
	}


	@Override
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	
}