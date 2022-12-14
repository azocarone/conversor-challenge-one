package modelo;

/**
 * @author José AZÓCAR (azocarone)
 *
 */
public class Tasa {
	
	private String nombre;
	private double valor;
	
	public Tasa() {
	}

	public Tasa(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getValor() {
		return valor;
	}

	public double aBolivares(double aConvertir) {
		return aConvertir / valor;
	}

	public double aDivisa(double aConvertir) {
		return aConvertir * valor;
	}
}
