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
			case "Moneda":
				vista.muestraMensaje("Tipos de cambio, importados de Internet.", "Advertencia", 2);
				ConsumoAPI consumoAPI = new ConsumoAPI();
				StringBuilder infoTipoCambio = consumoAPI.getTipoCambio();
				Tasa[] dolar = consumoAPI.setTipoCambio(infoTipoCambio, "USD");
				Tasa[] euro = consumoAPI.setTipoCambio(infoTipoCambio, "EUR");
				String selecionMoneda;
				do {
					double aConvertir = vista.entradaValor();
					selecionMoneda = vista.opcionMoneda();
					switch (selecionMoneda) {
					case "Dólar":
						vista.muestraCotizacion(dolar, null, aConvertir);
						break;
					case "Euro":
						vista.muestraCotizacion(euro, null, aConvertir);
						break;
					case "Bolívar (VED)":
						vista.muestraCotizacion(dolar, euro, aConvertir);
						break;
					}
				} while (selecionMoneda != "Cancelar");
				break;
			case "Temperatura":
				vista.muestraMensaje("Próximamente será habilitada.", "Información", 1);
				break;
			}
		} while (seleccionMenu != "Cancelar");
	}
}
