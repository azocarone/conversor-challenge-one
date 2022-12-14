package controlador;

import modelo.Tasa;
import vista.Interfaz;

/**
 * @author José AZÓCAR (azocarone)
 *
 */
public class Principal {

	public static void main(String[] args) {
		Interfaz vista = new Interfaz();
		String seleccionMenu;
		do {
			seleccionMenu = vista.menuPrincipal();
			switch (seleccionMenu) {
			case "Divisa":
				vista.muestraMensaje("- Conversor para el mercado monetario venezolano.\n"
						+ "- Tipos de cambio, importados de Internet.", "Advertencia", 2);
				divisa(vista);
				break;
			case "Temperatura":
				vista.muestraMensaje("Próximamente será habilitada.", "Información", 1);
				break;
			}
		} while (seleccionMenu != "Cancelar");
	}

	private static void divisa(Interfaz vista) {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		StringBuilder infoTipoCambio = consumoAPI.getTipoCambio();
		Tasa[] dolar = consumoAPI.setTipoCambio(infoTipoCambio, "USD");
		Tasa[] euro = consumoAPI.setTipoCambio(infoTipoCambio, "EUR");
		String selecionMoneda;
		do {
			double aConvertir = vista.entradaValor();
			if (aConvertir == 0) {
				selecionMoneda = "Cancelar";
			} else {
				selecionMoneda = vista.opcionMoneda();
				switch (selecionMoneda) {
				case "Bolívar (VED) a USD / EUR":
					vista.muestraCotizacion(dolar, euro, aConvertir);
					break;
				case "Dólar (USD) a VED":
					vista.muestraCotizacion(dolar, null, aConvertir);
					break;
				case "Euro (EUR) a VED":
					vista.muestraCotizacion(euro, null, aConvertir);
					break;
				}
			}
		} while (selecionMoneda != "Cancelar");
	}
}
