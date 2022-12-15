package vista;

import modelo.Tasa;
import javax.swing.JOptionPane;
import java.text.MessageFormat;

/**
 * @author José AZÓCAR (azocarone)
 *
 */
public class Interfaz {

	public String menuPrincipal() {
		Object[] posibilidad = { "Divisa", "Temperatura" };
		String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione tipo de conversión:", "Conversor",
				JOptionPane.QUESTION_MESSAGE, null, posibilidad, null);
		return (seleccion != null) ? seleccion : "Cancelar";
	}

	public double entradaValor() {
		String entrada = JOptionPane.showInputDialog("Ingrese cantidad a convertir:",
				"Solo cifras numéricas positivas ...");
		if (entrada == null) {
			return 0;
		} else if (entrada.isEmpty() || !entrada.matches("^[0-9]+([.][0-9]{1,2})?$")) {
			muestraMensaje("Entrada invalida.", "Error", 0);
			return entradaValor();
		}
		return Double.parseDouble(entrada);
	}

	public String opcionMoneda() {
		Object[] posibilidad = { "Bolívar (VED) a USD / EUR", "Dólar (USD) a VED", "Euro (EUR) a VED" };
		String seleccion = (String) JOptionPane.showInputDialog(null, "Elija divisa a cotizar:", "Cotización",
				JOptionPane.QUESTION_MESSAGE, null, posibilidad, posibilidad[1]);
		return (seleccion != null) ? seleccion : "Cancelar";
	}

	public void muestraCotizacion(Tasa[] divisa1, Tasa[] divisa2, double aConvertir) {
		String cotizacion = "";
		for (int i = 0; i < 5; i++) {
			if (divisa2 != null) {
				cotizacion = cotizacion + MessageFormat.format("{0}: ${1} / €{2} \n", divisa1[i].getNombre(),
						divisa1[i].aBolivares(aConvertir), divisa2[i].aBolivares(aConvertir));
			} else {
				cotizacion = cotizacion + MessageFormat.format("{0}: Bs.D {1} \n", divisa1[i].getNombre(),
						divisa1[i].aDivisa(aConvertir));
			}
		}
		muestraMensaje(cotizacion, "Información", 1);
	}

	public void muestraMensaje(String mensaje, String tipo, int icono) {
		JOptionPane.showMessageDialog(null, mensaje, tipo, icono);
	}
}
